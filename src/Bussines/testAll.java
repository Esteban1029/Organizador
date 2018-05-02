/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;
import Data.*;
import java.util.ArrayList;

/**
 *
 * @author Esteban Ladino
 */
public class testAll {
 
    public static void main(String[] args) {
      Event e=new Event("","2018 04 13","","",1);
      Event e1=new Event("","2018 02 13","","",1);  
      Event e2=new Event("","2018 03 13","","",1);  
      
      ArrayList<Event> lis=new ArrayList();
      
      lis.add(e);
      lis.add(e1);
      lis.add(e2);
      
      lis.forEach((s) -> {
          System.out.println(s.getDate());
        });
      
      ManagerEvents r =new ManagerEvents();
      r.tidyEvents(lis);
      
      lis.forEach((s) -> {
          System.out.println(s.getDate());
        });
      
   
      
    }
      
}
