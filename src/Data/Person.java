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
    
    
   private String nombre;
   private String correo;
   private boolean user;

    public Person(String nombre, String correo, boolean user) {
        this.nombre = nombre;
        this.correo = correo;
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }  
}
