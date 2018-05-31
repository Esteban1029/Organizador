
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussines;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Esteban
 */
public class ManagerDate {
    

 public Date StringToDate(String date) {
        int year,month,day,hour=0;
        year=month=day=0;
    
        ArrayList<String> elementos =new ArrayList();
        String aux[];

            aux=date.split(" ");
            for(String b:aux)
            {
                if(!b.equals(""))
                {
                   elementos.add(b.trim());
                }
            }
            
            for(String b:elementos)
            {
                if(elementos.size()==4)
                {
                    if(elementos.indexOf(b)==0)year=Integer.parseInt(b)-1900;
                    if(elementos.indexOf(b)==1)month=Integer.parseInt(b)-1;
                    if(elementos.indexOf(b)==2)day=Integer.parseInt(b);
                    if(elementos.indexOf(b)==3)hour=Integer.parseInt(b);
                   
                   
                    
                }
                else if(elementos.size()==3)
                {
                    if(elementos.indexOf(b)==0)year=Integer.parseInt(b)-1900;
                    if(elementos.indexOf(b)==1)month=Integer.parseInt(b)-1;
                    if(elementos.indexOf(b)==2)day=Integer.parseInt(b);
                    
                }
                
            }
            
                Date auxDate= new Date(year,month,day,hour,0);
             return auxDate;
    }
 
 
 
 
    
}
