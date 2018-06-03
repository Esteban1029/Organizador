/**
 * 
 * Se declaró estático el metodo shoMainScreen

 */
package Bussines;


import Data.Event;
import Data.Person;
import Gui.*;


import java.awt.Image;


import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author Andrés
 */
public class ManagerGui {
   
   private static String[] nameImageIcons;
   private final String pathFile= "Icons";
   private ImageIcon auxIcon;
   public int sizeIcon=150;
   
   static public void showMainScreen()
   {
       javax.swing.SwingUtilities.invokeLater(() -> {
           new MainScreen().setVisible(true);
        });
   }
    
    
   public void showIcons()
    {
    
       Icons icons = new Icons();
       icons.setVisible(true);
       icons.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
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
    public String[] searchImageIconPath()
   {
       File file=new File(pathFile);
       String[] contenido;
       if(file.exists())
       {
           if(file.isDirectory())
           { 
               nameImageIcons=file.list();
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
    public String[] nameImageIcon()
   {
       String[] name=new String[nameImageIcons.length]; 
       for (int i = 0; i < nameImageIcons.length; i++) {
          name[i]=nameImageIcons[i].substring(0, nameImageIcons[i].length()-4);
       }

           return name;
   }
    
    
    public ImageIcon[] arrayImageIcons()
    {
        
      
        ArrayList<ImageIcon> ImageIcon=new ArrayList();
      for(String a:searchImageIconPath())
      {
          
          auxIcon = new ImageIcon(a);
          ImageIcon.add(new ImageIcon(auxIcon.getImage().getScaledInstance(sizeIcon, sizeIcon,Image.SCALE_DEFAULT)));
      }
      
      ImageIcon[] arrayImageIcons = new ImageIcon[ImageIcon.size()];
      
      arrayImageIcons=ImageIcon.toArray(arrayImageIcons);
      
      return arrayImageIcons;
       
    }
   
    
      
}
