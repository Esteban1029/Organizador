

package Bussines;

import Data.Alarm;
import Data.Event;



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
        
        
        for(Event e: LoadDatas.readEvents())
        {
            for(Alarm a:e.getAlarm())
            {
                a.setActivated(true);
                System.out.println(e);
            }
            
        }
        
        
        ManagerGui.showMainScreen();

        
        //
       
        //prueba iconos
        
//        ManagerGui m = new ManagerGui();
//        m.showIcons();
        
        
//        Prueba de correo
//         
//        Alarm.notificacionCorreo("andres.ardila.estebanfajardo445@gmail.com","Andres",
//         "Ricardo","Party","Feb 19,2019","we would have fun");
//
////    prueba de Search
//            
//  Searcher s= new Searcher();
//
//       new PrincipalPantalla().setVisible(true);
//
//  
//  for(Event ew:s.generalSearch("esteban"))
//    {
//        System.out.println(ew);
//    } 
//
//   
//
    }
}
