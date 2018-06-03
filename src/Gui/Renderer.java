/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Data.Event;
import java.awt.Component;
import java.awt.Image;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Esteban
 */
public class Renderer extends DefaultListCellRenderer implements ListCellRenderer<Object>
    {
        private final ImageIcon defaultIcon= new ImageIcon("Icons\\Koala.PNG");
        private final int sizeIcon=50;
        
        @Override
        public Component getListCellRendererComponent(JList<?> list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus){
            
            
            Event is=(Event)value;
            setText(is.getName()+"-"+is.getDate());
            ImageIcon image=is.getIcon();
           
            if(is.getIcon()==null) image=defaultIcon;  
           
            
            setIcon(new ImageIcon(image.getImage().
                       getScaledInstance(sizeIcon, sizeIcon,Image.SCALE_DEFAULT)));

            if(isSelected)
            {
                setBackground(list.getSelectionBackground());
                this.setForeground(list.getSelectionForeground());

            }else
            {
                this.setBackground(list.getBackground());
                this.setForeground(list.getForeground());
            }

            setEnabled(true);
            setFont(list.getFont());
            
            return this;

        }
    }

