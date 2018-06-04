/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Data.Event;
import java.awt.Color;
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
        static boolean color;
    private Event is;
        
        public Renderer()
        {
            color=false;
        }
        
        @Override
        public Component getListCellRendererComponent(JList<?> list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus){
            
            
            is=(Event)value;
            System.out.println(is.getDate());
            try
            {
            
                this.setText(is.getName()+"   "+
                        String. format("%d-%d-%d",

                        is.getDate().getYear()+1900,
                        is.getDate().getMonth()+1,
                        is.getDate().getDate()));
            }catch(NullPointerException e)
            {
                this.setText(is.getName()+"    sin fecha");
            }
            
            ImageIcon image=is.getIcon();
           
            if(is.getIcon()==null) image=defaultIcon;  
           
            
            setIcon(new ImageIcon(image.getImage().
                       getScaledInstance(sizeIcon, sizeIcon,Image.SCALE_DEFAULT)));

            if(isSelected)
            {
                this.setBackground(list.getSelectionBackground());
                this.setForeground(list.getSelectionForeground());
                this.setForeground(Color.BLUE);
                

            }else
            {
                this.setBackground(list.getBackground());
                this.setForeground(list.getForeground());
            }

            setEnabled(true);
            setFont(list.getFont());
            if(true) importanceColor(); 
            
            return this;

        }
        
        private void importanceColor()
        {
            if(is.isExpire()) this.setBackground(Color.LIGHT_GRAY);
            else if(is.getImportance()<=2) this.setBackground(new Color(252,250,203));
            else if(is.getImportance()<=4) this.setBackground(new Color(191,255,201));
            else if(is.getImportance()<=6) this.setBackground(new Color(192,213,255));
            else if(is.getImportance()<=8) this.setBackground(new Color(255,242,242));
            else this.setBackground(new Color(255,229,230));
               
        }
        
    }

