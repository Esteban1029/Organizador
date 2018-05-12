/**
 * 
 * Se declaró estático el metodo shoMainScreen

 */
package Bussines;


import Data.Event;
import Data.Person;
import Gui.AvailableIcon;
import Gui.PantallaPrincipal;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class ManagerGui {
   
   private static String[] nameIcons;
   
   static public void showMainScreen()
   {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PantallaPrincipal.createAndShowGUI();
            }
        });
   }
    
   public void showIcons()
    {
    
      AvailableIcon mostrarIconos=new AvailableIcon();
      
      String[] rutas=searchIconPath("Icons");
      String[] nombreIconos=nameIcon();
      
      mostrarIconos.icon(rutas, nombreIconos);  
    }
   
   /**
    * Se muestran los eventos vencidos,vigentes , resultados de búsquedas...  
     * 
     * @param lisEven
    */
   public void showEvents(ArrayList<Event> lisEven)
   {
       
   }
   
   public void showExpireEvents(ArrayList<Event> lisEven)
   {
       
   }
   
   // Dichos o algo así.
   public void showDailyPhrase()
   {
       
   }
   /**
    * puede servir para mostrar el nombre de las personas a las que no
    * se les pudo enviar en correo o como resultado de una búsqueda.
    * @param lisPer
    */
   
   public  void showPerson(ArrayList<Person> lisPer)
   {
       
   }
   
   // Muestra un mensaje de error.
   public void showError(String message)
   {
       
   }
   
  
    
    // leer las imágenes disponibles en un archivo
    public String[] searchIconPath(String ruta)
   {
       File file=new File(ruta);
       String[] contenido;
       if(file.exists())
       {
           if(file.isDirectory())
           { 
               nameIcons=file.list();
               contenido=file.list(); 
                for (int i = 0; i < contenido.length; i++) {
                   contenido[i]=ruta+"\\"+"\\"+contenido[i];
               }

               return contenido;
           }
       }
       
       return null;
       
   }
   
   // mostrar solo los nombres de las imágenes sin extensiones.
    public String[] nameIcon()
   {
       String[] name=new String[nameIcons.length]; 
       for (int i = 0; i < nameIcons.length; i++) {
          name[i]=nameIcons[i].substring(0, nameIcons[i].length()-4);
       }

           return name;
   }
   
    
      
}
