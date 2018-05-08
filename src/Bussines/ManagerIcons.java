/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.Icon;
import Gui.AvailableIcon;

/**
 *
 * @author Esteban
 */
public class ManagerIcons {
    public void mostrarIcons()
    {
      Icon iconos=new Icon();
      AvailableIcon mostrarIconos=new AvailableIcon();
      
      String[] rutas=iconos.searchIconPath("Icons");
      String[] nombreIconos=iconos.nameIcon();
      
      mostrarIconos.icon(rutas, nombreIconos);  
    }
    
      
}
