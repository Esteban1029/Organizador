

package Bussines;

import Data.Event;
import Gui.PrincipalPantalla;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author
 */
public class MainManager{
 
    public static void main(String[] args) {
        //pantalla principal

//        Prueba de correo
//         
//        Alarm.notificacionCorreo("andres.ardila.estebanfajardo445@gmail.com","Andres",
//         "Ricardo","Party","Feb 19,2019","we would have fun"); 
//        


////    prueba de Search
//            
  Searcher s= new Searcher();

       new PrincipalPantalla().setVisible(true);

  
  for(Event ew:s.generalSearch("esteban"))
    {
        System.out.println(ew);
    } 

   

    }
      
}
