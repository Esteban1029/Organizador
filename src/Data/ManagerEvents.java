
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Esteban Ladino
 */
public class  ManagerEvents{
    
    public boolean saveEvents(ArrayList<Event> lisEve, String fileName)
    {
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileName));
            System.out.println("hola");
            salida.writeObject(lisEve);
            salida.close();
            
        }
        catch(IOException error)
        {
            return false;
        }
        return true;

    }
    
    public ArrayList<Event> readEvents(ArrayList<Event> lisEve,String fileName)
    {
        ObjectInputStream entrada;
        ArrayList<Event> eventos;
        
        try
        {
        entrada=new ObjectInputStream(new FileInputStream(fileName));
        eventos=(ArrayList<Event>)entrada.readObject();
        entrada.close();
        return eventos;
        
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
    
    public ArrayList<Event> tidyEvents(ArrayList<Event> lisEve)
    {
        return null;
    }
    
    
    
}
