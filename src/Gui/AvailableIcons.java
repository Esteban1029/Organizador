/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Esteban
 */

public class AvailableIcons  extends JFrame{
    private final JList<Icon> listaIconos;
    static Icon path;
    
    public AvailableIcons(Icon[] icons)
    {
        super("Prueba Jlist");
        setLayout(new FlowLayout());
        
        listaIconos= new JList(icons);
        listaIconos.setVisibleRowCount(3);
        listaIconos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(listaIconos));
        listaIconos.addListSelectionListener
        (
                new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent evento)
                    {
                         path=icons[listaIconos.getSelectedIndex()];
                         AvailableIcons.super.setVisible(false);
                    }
                    
                }
        );
        
        
    }

  
    
    
        
        
 }

    

