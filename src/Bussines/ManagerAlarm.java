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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

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
