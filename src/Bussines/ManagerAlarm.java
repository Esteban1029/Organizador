package Bussines;

import Data.Alarm;
import Data.Event;
import Data.Person;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 * FINAL()
 * @authors Andres Ardila, Esteban Ladino, Ivan Solano
 */
public class ManagerAlarm{

    //Background method que revisa la vigencia de los eventos y alarmas
    public static void actionAlarms(){
        
        System.out.println("actionAlarms ON");
        int contador=1;
        while(true){
            Date auxDate=new Date();
            Person usuario=null;
            
            for(Person persona: LoadDatas.readPersons()){
                if(persona.isUser()){
                    usuario = persona;
                }
                try{
                    usuario.getNombre();
                }catch(java.lang.NullPointerException exe){
                    usuario =new Person(" ", " ", true);
                }
                
            }
            
            ArrayList<Event> events = LoadDatas.readEvents();
            try{
            for(Event evento: events){
                if(!evento.isExpire()){
                    for(Alarm alarma:evento.getAlarm()){
                    
                        System.out.println(evento.getAlarm().size());
                        System.out.println(alarma.toString()+ " "+alarma.isActivated());
                        
                        System.out.println();
                    
                        if(alarma.getDate().compareTo(new Date())==-1&&!alarma.isActivated()){
                        
                            System.out.println("inIF");
                            notification(alarma,evento,evento.getGuestList(), usuario);
                            alarma.setActivated();
                            
                        }else{
                        
                            System.out.println("outIF");
                        
                        }
                    }
                }
                System.out.println("Tu tranquilo "+contador++);
            }
            }catch(NullPointerException ne){
                System.out.println("No pending");
                actionAlarms();
            }catch(Exception e){
                System.out.println("jejej Salu2");
            }
            LoadDatas.saveEvents(events);
            pause();
        }
    }
    //Utiliza los dos métodos de abajo para notificar.
    public static void notification(Alarm a,Event e,ArrayList<Person> guestList,Person user){
        switch (a.getTipoAlarma()) {
            case "Sonido,Correo":
                soundAlarm(e);
                sendGmail(e, guestList, user);
                break;
            case "Sonido":
                soundAlarm(e);
                break;
            case "Correo":
                sendGmail(e, guestList, user);
                System.out.println(a.toString()+" "+e.toString());
                //System.exit(0);
                break;
            default:
                System.out.println("Error notification");
                System.out.println(a.toString()+" "+e.toString());
                //System.exit(0);
                break;
        }
    }
    //Alarma Correo.
    public static void sendGmail(Event e,ArrayList<Person> guestList,Person user){
        
        for(Person persona: guestList){
            
            try{
                System.out.println("."+persona.getCorreo()+".");
                System.out.println("."+user.getNombre()+".");
                System.out.println("."+persona.getNombre()+".");
                System.out.println("."+e.getName()+".");
                System.out.println("."+e.getDate().toString()+".");
                System.out.println("."+e.getDescription()+".");
                
                if(persona.getCorreo().contains("@gmail.com")||persona.getCorreo().contains("@outlook")
                        ||persona.getCorreo().contains("@unal.edu.co")||persona.getCorreo().contains("@hotmail.com")||persona.getCorreo().contains("@hotmail.es"))
                {
                    emailSystem(persona.getCorreo(), user.getNombre(), 
                    persona.getNombre(), e.getName(), e.getDate().toString(),
                    e.getDescription());
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se pudo enviar correo a: "+persona.getNombre(), "Error correo", JOptionPane.WARNING_MESSAGE);
                }
                
                
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "No se pudo enviar correo a: "+persona.getNombre(), "Error correo", JOptionPane.WARNING_MESSAGE);
                ex.printStackTrace();
            }
        }
    }
    //Alarma sonido.
    public static void soundAlarm(Event e) {
        try{
            soundSystem();
            Thread.sleep(3000);
            soundSystem();
            Thread.sleep(3000);
            soundSystem();
            Thread.sleep(3000);
            soundSystem();
            
            JOptionPane.showMessageDialog(null, "Recordatorio para el evento: "+e.getName()+" el dia "+e.getDate(), "Alarma recordatorio", JOptionPane.INFORMATION_MESSAGE);
        }catch(InterruptedException i){
            
        }
        
    }
    //Maneja el sonido de la alarma.
    public static void soundSystem(){
        
        try {
         // Open an audio input stream.           
          File soundFile = new File("AlertSound.wav");
          if(!soundFile.exists())
          {
              soundFile=new File("src\\Data\\AlertSound.wav");
          }
         
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
      
          
      
    }
    //Maneja el email de la alarma.
    public static void emailSystem(String destino, String usuario, String nombreInvitado, String eventName, String date, String descripcion){
        String remitente = "meetingmanagerpoo";
        String clave ="POOAponte1";
        
        String asunto ="Reunion de: "+usuario;
        String cuerpo ="Hola "+nombreInvitado+",\n"+
        "\n" +
        "Usted ha sido invitado a "+eventName+ " por "+usuario+" el dia "+date+" donde: "+descripcion+" \n" +
        "\n" +
        "Gracias,\n" +
        "MeetingManager";
        
        Properties props = System.getProperties();
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");  //El servidor SMTP de Google
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave);    //La clave de la cuenta
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
        
        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        
        try{
            message.setFrom(new InternetAddress(remitente));
            
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));   //Se podrían añadir varios de la misma manera
            message.setSubject(asunto);
            message.setText(cuerpo);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }catch(MessagingException me){
            me.printStackTrace();

        }

     }
    // Eventos que tienen alarmas vencidas.
    public ArrayList<Event> ExpireAlarm(){
        ArrayList<Event> lisEve= new ArrayList();
        
        for(Event evento: LoadDatas.readEvents())
        {
            if(!evento.isExpire())
            {    
                for(Alarm alarma:evento.getAlarm())
                {
                    if(alarma.isExpire())
                    {
                        lisEve.add(evento);
                    }
                }
            }    
        }
        
        if(lisEve.isEmpty())
            return null;
        
        return lisEve;
        
    }
    //Eventos que tienen alarmas pendiendes.
    public static ArrayList<Event> pendingAlarm(){
        ArrayList<Event> lisEve= new ArrayList();
        
        for(Event evento: LoadDatas.readEvents())
        {
            if(!evento.isExpire())
            {    
                for(Alarm alarma:evento.getAlarm())
                {
                    if(!alarma.isExpire()&&!alarma.isActivated())
                    {
                        lisEve.add(evento);
                    }
                }
            }    
        }
        
        if(lisEve.isEmpty())
            return null;
        
        return lisEve;
        
    }
    
    static void pause() {
        
        try
        {
          Thread.sleep(1000);
        }catch(InterruptedException ex)
        {
            
        }
    }
    
}
