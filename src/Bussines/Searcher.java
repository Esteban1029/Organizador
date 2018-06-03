/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.Event;
import Data.Person;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Searcher {
    private final ArrayList<Event> input=LoadDatas.readEvents();
    private final ArrayList<Event> resultSearcher= new ArrayList();
    static ArrayList<Event> auxResultSearcher= new ArrayList();
    

    public ArrayList<Event> searchEvent(String word){
        
        for(Event e:input)
        {
            if(e.getName()!=null)
            {

                if(e.getName().toLowerCase().contains
                        (word.toLowerCase()))
                {
                    resultSearcher.add(e);
                }
            }
        }
        return resultSearcher;   
    }
    
    public ArrayList<Event> searchPerson(String word){
        for(Event e:input)
        {
            if(e.getGuestList()!=null)
            {                
                for(Person p:e.getGuestList())
                {
                    if(p.getNombre().toLowerCase().contains
                        (word.toLowerCase()))
                    {
                        resultSearcher.add(e);
                    }
                } 
            }
        }
        return resultSearcher;   
    }
    
    public ArrayList<Event> searchPlace(String word){
        for(Event e:input)
        {
            if(e.getPlace()!=null)
            {
                if(e.getPlace().toLowerCase().contains
                 (word.toLowerCase()))
                {
                    resultSearcher.add(e);
                }
            }
        }
        return resultSearcher;   
    }
    
    public ArrayList<Event> searchDate(String word){
        // El formato de entrada debe ser: yyyy,MM,dd
        for(Event e:input)
        {
            if(e.toStringDate()!=null)
            {
   
                if(e.toStringDate().contains(word))
                {
                    resultSearcher.add(e);
                }
            }
        }
        return resultSearcher;
    }
    
    public ArrayList<Event> searchDescription(String word){
        for(Event e:input)
        {   
            if(e.getDescription()!=null)
            {
                if(e.getDescription().toLowerCase().
                        contains(word.toLowerCase()))
                {
                    resultSearcher.add(e);
                }
            }   
        }
        return resultSearcher;
     
    }
    
    public ArrayList<Event> generalSearch(String word)
    {
        
        searchEvent(word);
        searchPerson(word);
        searchPlace(word);
        searchDate(word);
        searchDescription(word);
        auxResultSearcher=resultSearcher;
        resultSearcher.clear();
        return auxResultSearcher;
    }
    
     
    
    public int[] availableSearch(String word)
    {
        int bqd[]={searchEvent(word).size(),
            searchPerson(word).size(),
            searchPlace(word).size(),
            searchDate(word).size(),
            searchDescription(word).size(),};
        
      return bqd;
        
            
    }

    static public ArrayList<Event> getResultSearcher() {
        return auxResultSearcher;
    }

}
