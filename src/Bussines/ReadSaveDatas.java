/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.Event;
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
public class ReadSaveDatas {
    static String fileNameEvents="Events.ser";
    static String fileNameUser="User.ser";

    static public boolean saveEvents(ArrayList<Event> lisEve)
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
    
    
    
    static public ArrayList<Event> readEvents()
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
        
        return null;
    }
    
    public User readUser()
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
    
    public boolean saveUser(User user)
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
        
}
