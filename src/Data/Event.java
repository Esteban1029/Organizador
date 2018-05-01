package Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
/**
 * El String date se convierte a tipo Date
 * Cuando de instancie en el String date poner: yyyy mm dd hr o los tres primeros
 */
public class Event implements Serializable{
    
    private static final long serialVersionUID= 112233445566778899l;
    private String name;
    private Date date;
    private Date made;  // fecha de creación
    private String description;
    private String place;
    private int importance;

    public Event(String name,String date, String description, String place, int importance) {
        this.name = name;
        setDate(date);
        this.description = description;
        this.place = place;
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) {
        int year=0;
        int month=0;
        int day=0;
        int hour=0;
        Date verificar= new Date();
        ArrayList<String> elementos =new ArrayList();
        String aux[];
        this.made=new Date();

            aux=date.split(" ");
            for(String b:aux)
            {
                if(!b.equals(""))
                {
                   elementos.add(b.trim());
                }
            }

          
        
        try
        {
         
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
                else
                {
                    this.date=null;
                    System.out.println("Ingrese los datos de manera coherente");
                }
            }
            
            
            if(year>verificar.getYear()||month>verificar.getMonth()||
                    day>verificar.getDay()||(hour>verificar.getHours()&&
                    hour!=0))
            {
                this.date= new Date(year,month,day,hour,0);
            }
            else
            {
                    System.out.println("Fecha incohrente");
            }
        }
        catch(NumberFormatException error )
        {
            System.out.println("Ingrese los datos de forma coherente\n"
                    + "yyyy mm dd hr o los tres primeros campos");
        }
        

      
    }
    
        public Date getMade() {
        return made;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
    
    
    public String restTime()
    {
        System.out.println("Dias,horas,minutos");
        // da el tiempo que falta en dias,horas y minutos.
        double time;
        int days,hours,minutes;
        String auxTime;
        Date current = new Date();
        try
        {
        time=(date.getTime()-current.getTime())/86400000d;
        days=(int)time;
        time-=Math.floor(time);
        time*=24;
        hours=(int)time;
       
        time-=Math.floor(time);
        time*=60;
        minutes=(int)time;
        
        auxTime=String.format("%d,%d,%d",
                days,hours,minutes);
        
            return auxTime;
        }
        catch(NullPointerException error)
        {
            return null;
        }
        
    }
    
    public boolean isExpire()
    {
        Date auxDate= new Date();
        try
        {
           return auxDate.compareTo(date)==1;    
        }
        catch(NullPointerException error)
        {
           return true; 
        }
        
    }
    
}


