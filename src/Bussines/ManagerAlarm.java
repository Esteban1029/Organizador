package Bussines;

import Data.Alarm;
import Data.Event;
import Data.Person;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
    public void actionAlarms(){
        while(true){
            Date auxDate=new Date();
            Person usuario=null;
            for(Person persona: LoadDatas.readPersons()){
                if(persona.isUser()){
                    usuario = persona;
                }
            }
            for(Event evento: pendingAlarm()){
                for(Alarm alarma:evento.getAlarm()){
                    if(auxDate.compareTo(alarma.getDate())==1){
                        notification(alarma,evento,evento.getGuestList(), usuario);
                        alarma.setActivated(true);
                    }
                }
            }
        }
    }
    //Utiliza los dos métodos de abajo para notificar.
    public void notification(Alarm a,Event e,ArrayList<Person> guestList,Person user){
        switch (a.getTipoAlarma()) {
            case "sonido,correo":
                sendGmail(e, guestList, user);
                soundAlarm(e);
                break;
            case "sonido":
                soundAlarm(e);
                break;
            case "correo":
                sendGmail(e, guestList, user);
                break;
            default:
                System.out.println("Error notification");
                break;
        }
    }
    //Alarma Correo.
    public ArrayList<Person> sendGmail(Event e,ArrayList<Person> guestList,Person user){
        for(Person persona: guestList){
            Alarm.notificacionCorreo(persona.getCorreo(), user.getNombre(), 
                    persona.getNombre(), e.getName(), e.getDate().toString(),
                    e.getDescription());
        
    }
        return null;
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
          File soundFile = new File("AlertSound.wav"); //you could also get the sound file with an URL
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
    public ArrayList<Event> pendingAlarm(){
        ArrayList<Event> lisEve= new ArrayList();
        
        for(Event evento: LoadDatas.readEvents())
        {
            if(!evento.isExpire())
            {    
                for(Alarm alarma:evento.getAlarm())
                {
                    if(!alarma.isExpire())
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
    
}
