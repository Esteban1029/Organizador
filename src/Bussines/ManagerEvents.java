
/**
 * Se declararon estaticos los metodos de guardar y leer 
 * eventos, para no tener que instanciar en cada momento.
 * 

 */
package Bussines;


import Data.Event;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Esteban Ladino
 */
public class  ManagerEvents{
    

    
    static public ArrayList<Event> tidyEvents(ArrayList<Event> lisEve)
    {
        // EL programa necesita que devuelva en ArrayList
      Collections.sort(lisEve);
      return lisEve;
    }
    
    
    public ArrayList<Event> ExpireEvents(){
        ArrayList<Event> lisEven=new ArrayList();
        
        
        for(Event evento:ReadSaveDatas.readEvents())
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
