package Bussines;


/**
 * FINAL()
 * @authors Andres Ardila, Esteban Ladino, Ivan Solano
 */
public class MainManager{
 
    public static void main(String[] args) {


        ManagerGui.showMainScreen();
        
        ManagerAlarm.actionAlarms();
        ManagerAlarm.emailSystem("saeekz23@gmail.com", "carlos", "Ivan", "party", "09/08/2018", "vamo a farriar");

        //Prueba de correo
        //ManagerAlarm.sendGmail("andres.ardila.agudelo@gmail.com","Andres",
        // "Ricardo","Party","Feb 19,2019","we would have fun");
        
        //Prueba Sonido
        //ManagerAlarm.soundSystem();
    }
}
