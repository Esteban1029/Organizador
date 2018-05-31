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
    private ArrayList<Event> input=LoadDatas.readEvents();
    private ArrayList<Event> output= new ArrayList();
    

    public ArrayList<Event> searchEvent(String word){
        System.out.println("a");
        
        for(Event e:input)
        {
            if(e.getName()!=null)
            {

                if(word.toLowerCase().
                        equals(e.getName().toLowerCase()))
                {
                    output.add(e);
                }
            }
        }
        return output;   
    }
    
    public ArrayList<Event> searchPerson(String word){
      System.out.println("b");
        for(Event e:input)
        {
            if(e.getGuestList()!=null)
            {                
                for(Person p:e.getGuestList())
                {
                    if(p.getNombre().toLowerCase().equals
                        (word.toLowerCase()))
                    {
                        output.add(e);
                    }
                } 
            }
        }
        return output;   
    }
    
    public ArrayList<Event> searchPlace(String word){
     System.out.println("c");
        for(Event e:input)
        {
            if(e.getPlace()!=null)
            {
                if(word.toLowerCase().equals
                 (e.getPlace().toLowerCase()))
                {
                    output.add(e);
                }
            }
        }
        return output;   
    }
    
    public ArrayList<Event> searchDate(String word){
        // El formato de entrada debe ser: yyyy,MM,dd
       System.out.println("d");
        for(Event e:input)
        {
            if(e.toStringDate()!=null)
            {
   
                if(word.equals(e.toStringDate()))
                {
                    output.add(e);
                }
            }
        }
        return output;
    }
    
    public ArrayList<Event> searchDescription(String word){
     System.out.println("e");
        for(Event e:input)
        {   
            if(e.getDescription()!=null)
            {
                if(e.getDescription().toLowerCase().
                        contains(word.toLowerCase()))
                {
                    output.add(e);
                }
            }   
        }
        return output;
     
    }
    
    public ArrayList<Event> generalSearch(String word)
    {
        searchEvent(word);
        searchPerson(word);
        searchPlace(word);
        searchDate(word);
        searchDescription(word);
        return output;
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
    

}
