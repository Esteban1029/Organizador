/**
 * 
 * Se declaró estático el metodo shoMainScreen

 */
package Bussines;


import Data.Event;
import Data.Person;
import Gui.AvailableIcons;
import Gui.PrincipalPantalla;


import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Andrés
 */
public class ManagerGui {
   
   private static String[] nameIcons;
   private final String pathFile= "Icons";
   
   static public void showMainScreen()
   {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalPantalla().setVisible(true);
            }
        });
   }
    
   public void showIcons()
    {
    
      AvailableIcons mostrarIconos=new AvailableIcons(arrayIcons());
      mostrarIconos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mostrarIconos.setSize(300,500);
      mostrarIconos.setVisible(true);
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
    public String[] searchIconPath()
   {
       File file=new File(pathFile);
       String[] contenido;
       if(file.exists())
       {
           if(file.isDirectory())
           { 
               nameIcons=file.list();
               contenido=file.list(); 
                for (int i = 0; i < contenido.length; i++) {
                   contenido[i]=pathFile+"\\"+"\\"+contenido[i];
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
    
    
    public Icon[] arrayIcons()
    {
      
        ArrayList<Icon> iconos=new ArrayList();
      for(String a:searchIconPath())
      {
          
          iconos.add(new ImageIcon(a));
      }
      
      Icon[] arrayIcons = new Icon[iconos.size()];
      
      arrayIcons=iconos.toArray(arrayIcons);
      
      return arrayIcons;
       
    }
   
    
      
}
