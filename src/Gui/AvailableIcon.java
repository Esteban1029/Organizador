/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Esteban
 */

public class AvailableIcon {
    
    public void icon(String[] lisIcon,String[] nameIcons)
    {
     auxIcon mostrar= new auxIcon(lisIcon,nameIcons);
     mostrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     mostrar.setSize(300,200);
     mostrar.setVisible(true);
    }
 
    
    private class auxIcon extends JFrame
    {
        private final ArrayList<Icon> listIcon;
        private final String[] nombreIcon;
        private JComboBox<String> opciones;
        private JLabel imagen;
        
        public auxIcon(String[] lisIcon, String[] nameIcons)
        {
            
            super("escoja la imagen");
            setLayout(new FlowLayout());
            
            nombreIcon=nameIcons;
            listIcon= new ArrayList();
            
            for(String a:lisIcon)
            {
                Icon b=new ImageIcon(a);
                listIcon.add(b);
                
            }
            
            opciones = new JComboBox<>(nombreIcon);
            opciones.setMaximumRowCount(3);
            
            opciones.addItemListener
        (
     new ItemListener()
            // es similar a que la clase implement a ItemListener
            {
                @Override
                public void itemStateChanged(ItemEvent evento)
                {
                    if(evento.getStateChange()==ItemEvent.SELECTED)
                    {
                        imagen.setIcon(listIcon.get(
                                opciones.getSelectedIndex()));
                        //JOptionPane.showMessageDialog(auxIcon.this,"Ha elegido "+
                          //      nombreIcon[opciones.getSelectedIndex()]);
                    }
                }
            }
        
        );
            add(opciones);
            imagen=new JLabel(listIcon.get(0));
            add(imagen);
            
       }
        
    }

    
}
