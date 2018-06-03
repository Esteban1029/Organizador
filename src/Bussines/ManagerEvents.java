
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
        
        
        for(Event evento:LoadDatas.readEvents())
        {
            if(evento.isExpire())
                lisEven.add(evento);
        }
        
        if(lisEven.isEmpty())
            return null;
        return lisEven;
    }
    
    public static boolean addEvent(Event event){
        
        ArrayList <Event> events =LoadDatas.readEvents();
        boolean iscreated = false;
        for(Event e: events){
            if(event.equals(e)){
                iscreated=true;
            }
        }
        if(iscreated==false){
            events.add(event);
            LoadDatas.saveEvents(events);
            return true;
        }else{
            
            return false;
        }
    }
    /*public Event makeEvent(String name,String description,String place, Date date, int importance){
       ArrayList <Event> events =ManagerEvents.readEvents();
       ArrayList<Person> guestList = new ArrayList();
       ArrayList<Alarm> alarm =new ArrayList();
        
    }*/
    
    public void deleteEvent(Event event){
        
        ArrayList <Event> events =LoadDatas.readEvents();
        for(Event e: events){
            if(event.equals(e)){
                events.remove(e);
            }
        }
        
    }
    
    public void editEvent(){
        
    }
    
    public void createguestList(){
        
    }
    
    public ArrayList<Event> searchEvent(){
        return null;
    }
    
    
         
    
    
    
    
    
    
    
}
