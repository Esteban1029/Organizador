/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Person implements Serializable{

   private static final long serialVersionUID= 112233445566778899l; 
   static String fileName="Invitados.ser"; 
   private String nombre;
   private String correo;
   private boolean user;

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }  
    public static boolean savePerson(ArrayList<Person> lisEve)
    {
        ObjectOutputStream salida;
        try
        {
            salida=new ObjectOutputStream(new FileOutputStream(fileName));
            //Ordena los eventos antes de guardarlos
            
            
            salida.writeObject(lisEve);
            salida.close();
            
        }
        catch(IOException error)
        {
            return false;
        }
        return true;

    }
    
    
    
    public static ArrayList<Person> readPersons()
    {
        
        ObjectInputStream entrada;
        ArrayList<Person> personas;
        
        try
        {
        entrada=new ObjectInputStream(new FileInputStream(fileName));
        personas=(ArrayList<Person>)entrada.readObject();
        entrada.close();
        return personas;
        
        }
        catch(IOException error)
        {
            System.out.println("No se puede abrir el archivo "+ fileName);
        }
        catch (ClassNotFoundException error)
        {
            System.out.println("las clases no son sompatibles");
        }
        
        return null;
    }

}
