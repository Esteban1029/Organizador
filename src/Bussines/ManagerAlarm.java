/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.Alarm;
import Data.Event;
import Data.Person;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
            Alarm.notificacionCorreo(persona.getCorreo(), user.getNombre(), 
                    persona.getNombre(), e.getName(), e.getDate().toString(),
                    e.getDescription());
        
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
    
    
    
}
