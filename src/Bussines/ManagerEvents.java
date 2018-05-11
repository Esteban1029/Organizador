
/**
 * Se declararon estaticos los metodos de guardar y leer 
 * eventos, para no tener que instanciar en cada momento.
 * 

 */
package Bussines;


import Data.Event;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Esteban Ladino
 */
public class  ManagerEvents{
    
    static String fileName="Events.ser";
    
    
    static boolean saveEvents(ArrayList<Event> lisEve)
    {
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileName));
            //Ordena los eventos antes de guardarlos
            tidyEvents(lisEve);
            
            salida.writeObject(lisEve);
            salida.close();
            
        }
        catch(IOException error)
        {
            return false;
        }
        return true;

    }
    
    
    
    static ArrayList<Event> readEvents()
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
    
    
    
    static ArrayList<Event> tidyEvents(ArrayList<Event> lisEve)
    {
        // EL programa necesita que devuelva en ArrayList
      Collections.sort(lisEve);
      return lisEve;
    }
    
    
    public ArrayList<Event> ExpireEvents(){
        ArrayList<Event> lisEven=new ArrayList();
        
        
        for(Event evento:readEvents())
        {
            if(evento.isExpire())
                lisEven.add(evento);
        }
        
        if(lisEven.isEmpty())
            return null;
        return lisEven;
    }
    
    
    public void makeEvent()
    {
        
    }
    
    public void deleteEvent()
    {
        
    }
    
    public void editEvent()
    {
        
    }
    
    
    public ArrayList<Event> searchEvent()
    {
        return null;
    }
    
    
         
    
    
    
    
    
    
    
}
