package Bussines;

import Data.Person;
import java.util.Date;


/**
 * FINAL()
 * @authors Andres Ardila, Esteban Ladino, Ivan Solano
 */
public class MainManager{

    public static void main(String[] args) {

       
       
//
          ManagerGui.showMainScreen();
//        
          ManagerAlarm.actionAlarms();
           /*for(Person persona: LoadDatas.readPersons()){
               System.out.println("."+persona.getCorreo()+".");
               ManagerAlarm.emailSystem(persona.getCorreo(),"Andres","Ricardo","Party","Feb 19,2019","we would have fun");
    
           }*/
        //Prueba de correo
        //ManagerAlarm.emailSystem("andres.ardila.agudelo@gmail.com","Andres","Ricardo","Party","Feb 19,2019","we would have fun");
    //    ManagerAlarm.emailSystem("fanton123@hotmail.es", "Ivan", "Carlos", "party", "Feb 19,2019", "we would have fun");
        //Prueba Sonido
        //ManagerAlarm.soundSystem();
    }
}
