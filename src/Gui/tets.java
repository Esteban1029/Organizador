package Gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Bussines.LoadDatas;
import Data.Alarm;
import Data.Event;
import Data.Person;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Ivan Solano
 */
public class tets {
    
    public static void main(String[] args) {
        ArrayList <Event> lista = LoadDatas.readEvents();
        
        lista.remove(0);
        LoadDatas.saveEvents(lista);
        
    }
    
    
    
    
    
}
