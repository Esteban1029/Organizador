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
    private ArrayList<Event> input=ReadSaveDatas.readEvents();
    private ArrayList<Event> output= new ArrayList();
    
    public Searcher()
    {
        this.output=null;
    }
    
    public ArrayList<Event> searchEvent(String word){
        output.clear();
        for(Event e:input)
        {
            if(word.toLowerCase().
                    equals(e.getName().toLowerCase()))
            {
                output.add(e);
            }
        }
        return output;   
    }
    
    public ArrayList<Event> searchPerson(String word){
      output.clear();
        for(Event e:input)
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
        return output;   
    }
    
    public ArrayList<Event> searchPlace(String word){
     output.clear();
        for(Event e:input)
        {
            if(word.toLowerCase().equals
             (e.getPlace().toLowerCase()))
            {
                output.add(e);
            }
        }
        return output;   
    }
    
    public ArrayList<Event> searchDate(String word){
        // El formato de entrada debe ser: yyyy,MM,dd
        output.clear();
        for(Event e:input)
        {
            if(word.equals(e.toStringDate()))
            {
                output.add(e);
            }
        }
        return output;
    }
    
    public ArrayList<Event> searchDescription(String word){
     int range=5;
     boolean verificador=false;
     
     if(word.length()>=range)
     {
         word=word.substring(0,range).toLowerCase();
     }
     
     output.clear();
        for(Event e:input)
        {
            if(e.getDescription().length()>=range)
            {
                verificador = true;
            }
            
            if(!verificador) continue;
            
            if(e.getDescription().toLowerCase().
                    contains(word.toLowerCase()))
            {
                output.add(e);
            }
        }
        return output;
     
    }

}
