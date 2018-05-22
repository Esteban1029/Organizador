/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import static Bussines.ManagerEvents.fileName;
import Data.Alarm;
import Data.Event;
import Data.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author
 */
public class ManagerAlarm{
    static String fileName="Alarms.ser";
    
    public static boolean saveAlarms(ArrayList<Event> lisEve)
    {
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileName));
            //Ordena los eventos antes de guardarlos
            
            
            salida.writeObject(lisEve);
            salida.close();
            
        }
        catch(IOException error)
        {
            return false;
        }
        return true;

    }
    
    
    
    public static ArrayList<Alarm> readAlarms()
    {
        
        ObjectInputStream entrada;
        ArrayList<Alarm> Alarms;
        
        try
        {
        entrada=new ObjectInputStream(new FileInputStream(fileName));
        Alarms=(ArrayList<Alarm>)entrada.readObject();
        entrada.close();
        return Alarms;
        
        }
        catch(IOException error)
        {
            System.out.println("No se puede abrir el archivo "+ fileName);
        }
        catch (ClassNotFoundException error)
        {
            System.out.println("las clases no son sompatibles");
        }
        
        return null;
    }
    //Utiliza los dos métodos de abajo para notificar.
    public void notification(Alarm a,Event e,ArrayList<Person> guestList,Person user)
    {
       if(a.getTipoAlarma().equals("both")){
           sendGmail(e, guestList, user);
           soundSystem();
       }else if(a.getTipoAlarma().equals("sonido")){
           soundSystem();
       }else if(a.getTipoAlarma().equals("correo")){
           sendGmail(e, guestList, user);
       }else{
           System.out.println("Error notification");
       }
    }
    
    
    public ArrayList<Person> sendGmail(Event e,ArrayList<Person> guestList,Person user)
    {
        for(Person persona: guestList){
            Alarm.notificacionCorreo(persona.getCorreo(), user.getNombre(), persona.getNombre(), e.getName(), e.getDate().toString(), e.getDescription());
        
    }
        return null;
    }
    
    //Notifica al usuario
    public void soundSystem(){
        try {
         // Open an audio input stream.           
          File soundFile = new File(""); //you could also get the sound file with an URL
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
    public ArrayList<Event> ExpireAlarm()
    {
        ArrayList<Event> lisEve= new ArrayList();
        
        for(Event evento: ReadSaveDatas.readEvents())
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
    
    
    
}
