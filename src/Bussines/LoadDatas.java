/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;


import Data.Alarm;
import Data.Event;
import Data.Person;
import Data.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class LoadDatas {
    static String fileNameEvents="Events.ser";
    static String fileNameUser="User.ser";
    static String fileNamePerson="Invitados.ser";
    static String fileNameAlarm="Alarms.ser";
    
    
     public static boolean saveEvents(ArrayList<Event> lisEve)
    {
        
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileNameEvents));
            //Ordena los eventos antes de guardarlos
            ManagerEvents.tidyEvents(lisEve);
            
            salida.writeObject(lisEve);
            salida.close();
            
        }
        catch(IOException error)
        {
            return false;
        }
        return true;

    }
    
    
    
     public static ArrayList<Event> readEvents()
    {
        
        ObjectInputStream entrada;
        ArrayList<Event> eventos;
        
        try
        {
        entrada=new ObjectInputStream(new FileInputStream(fileNameEvents));
        eventos=(ArrayList<Event>)entrada.readObject();
        entrada.close();
        return eventos;
        
        }
        catch(IOException error)
        {
            System.out.println("No se puede abrir el archivo "+ fileNameEvents);
        }
        catch (ClassNotFoundException error)
        {
            System.out.println("las clases no son sompatibles");
        }
        
        return new ArrayList();
    }
    
     public static User readUser()
    {
        ObjectInputStream entrada;
        User user;
        
        try
        {
        entrada=new ObjectInputStream(new FileInputStream(fileNameUser));
        user=(User)entrada.readObject();
        entrada.close();
        return user;
        
        }
        catch(IOException error)
        {
            System.out.println("No se puede abrir el archivo "+ fileNameUser);
        }
        catch (ClassNotFoundException error)
        {
            System.out.println("las clases no son sompatibles");
        }
        
       return null;         
    }
    
    public static  boolean saveUser(User user)
    {
 
     ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileNameUser));
            //Ordena los eventos antes de guardarlo
            
            salida.writeObject(user);
            salida.close();
            
        }
        catch(IOException error)
        {
            return false;
        }
        return true;
   
    }
   
    
    public static boolean savePerson(ArrayList<Person> lisEve)
    {
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileNamePerson));
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

    public static ArrayList<Person> readPersons()
    {
        
        ObjectInputStream entrada;
        ArrayList<Person> personas;
        
        try
        {
        entrada=new ObjectInputStream(new FileInputStream(fileNamePerson));
        personas=(ArrayList<Person>)entrada.readObject();
        entrada.close();
        return personas;
        
        }
        catch(IOException error)
        {
            System.out.println("No se puede abrir el archivo "+ fileNamePerson);
        }
        catch (ClassNotFoundException error)
        {
            System.out.println("las clases no son sompatibles");
        }
        
        return new ArrayList();
    }
    
    public static boolean saveAlarms(ArrayList<Event> lisEve)
    {
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileNameAlarm));
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
        entrada=new ObjectInputStream(new FileInputStream(fileNameAlarm));
        Alarms=(ArrayList<Alarm>)entrada.readObject();
        entrada.close();
        return Alarms;
        
        }
        catch(IOException error)
        {
            System.out.println("No se puede abrir el archivo "+ fileNameAlarm);
        }
        catch (ClassNotFoundException error)
        {
            System.out.println("las clases no son sompatibles");
        }
        
        return new ArrayList();
    }

}
