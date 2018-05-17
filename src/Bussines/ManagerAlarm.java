/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.Alarm;
import Data.Event;
import Data.Person;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class ManagerAlarm {
    
    
    //Utiliza los dos métodos de abajo para notificar.
    public void notification()
    {
       
    }
    
    
    public ArrayList<Person> sendGmail()
    {
        return null;
    }
    
    //Notifica al usuario
    public void soundSystem()
    {
        
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
