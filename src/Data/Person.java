/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;



/**
 *
 * @author Esteban
 */
public class Person implements Serializable{

   private static final long serialVersionUID= 112233445566778899l;  
   private String nombre;
   private String correo;
   private boolean user;

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }
    
    
    public Person(String nombre, String correo, boolean user) {
        this.nombre = nombre.trim();
        this.correo = correo.trim();
        this.user = user;
    }

    public Person(String nombre, String correo) {
        this.nombre = nombre.trim();
        this.correo = correo.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo.trim();
    }
    
}
