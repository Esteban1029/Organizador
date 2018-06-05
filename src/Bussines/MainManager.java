package Bussines;

import java.util.Date;


/**
 * FINAL()
 * @authors Andres Ardila, Esteban Ladino, Ivan Solano
 */
public class MainManager{
 
    public static void main(String[] args) {


        ManagerGui.showMainScreen();
        
        ManagerAlarm.actionAlarms();
        
        //Prueba de correo
        //ManagerAlarm.sendGmail("andres.ardila.agudelo@gmail.com","Andres",
        // "Ricardo","Party","Feb 19,2019","we would have fun");
        
        //Prueba Sonido
        //ManagerAlarm.soundSystem();
    }
}
