/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Bussines.ManagerEvents;
import Data.Alarm;
import Data.Event;
import Data.Person;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Ivan Solano
 */
public class tets {
    
    public static void main(String[] args) {
        ArrayList <Person> lista = new ArrayList();
        ArrayList <Alarm> lista1 = new ArrayList();
        Event event = new Event("sd","sd","sd",new Date(),10,lista,lista1);
        ArrayList <Event> a = new ArrayList();
        a.add(event);
        ManagerEvents.saveEvents(a);
        
    }
    
    
    
    
    
}
