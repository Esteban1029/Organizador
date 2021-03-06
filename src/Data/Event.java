package Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 * El String date se convierte a tipo Date
 * Cuando de instancie en el String date poner: yyyy mm dd hr o los tres primeros
 */

public final class Event implements Serializable, Comparable<Event>{
    
    private static final long serialVersionUID= 112233445566778899l;
    
    private int importance;
    private String name;
    private String description;
    private String place;
    
    private final Date made;  //   fecha de creación
    private Date date;

    private ArrayList<Person> guestList;
    private ArrayList<Alarm> alarm;
    
    private ImageIcon icon;

    public Event() {
        this.guestList=new ArrayList<>();
        this.alarm= new ArrayList<>();
        setName("");
        setDate(date);
        this.made = new Date();
        setDescription("");
        setPlace("");
        setImportance(0);

    }

    
    public Event(String name,String description,String place, Date date,  int importance, 
            ArrayList<Person> guestList, ArrayList<Alarm> alarm) 
    {
        this.guestList=new ArrayList<>();
        this.alarm= new ArrayList<>();
        setName(name);
        setDate(date);
        this.made = new Date();
        setDescription(description);
        setPlace(place);
        setImportance(importance);
        
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null) name="";    
        this.name = name.trim();
    }
    
    public Date getMade() 
    {
    return made;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description==null) description="";
        this.description = description.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if(place==null) place="";
        this.place = place.trim();
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public ArrayList<Person> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Person> guestList) {
        
        
        this.guestList = guestList;
    }


    public void setGuestList(ArrayList<Person> guestList, String name, String correo,boolean isuser) {
        
        Person guest = new Person(name,correo,isuser);
        guestList.add(guest);
        
        this.guestList = guestList;
    }

    public Date getDate() {
        return date;
    }
    
    public String toStringDate() {

        try
        {
        String d=String.format("%d,%d,%d",date.getYear(),date.getMonth(),date.getDate());

        return d;
        }catch(NullPointerException e)
        {
            return "";
    }

    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public ArrayList<Alarm> getAlarm() {
        return alarm;
    }

    public void setAlarm(ArrayList<Alarm> alarm) {
        this.alarm = alarm;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
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
    
    public  boolean isExpire()
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
    
    
    @Override 
    public int compareTo(Event e)
    {
        try
        {
            return date.compareTo(e.getDate());
        }
        catch(NullPointerException d)
        {
            return 1;
        }
        
    }
    
    @Override
    public String toString()
    {
    String a=String.format("Nombre: %s\n Lugar: %s\n Descripcion: %s\n Fecha: %s\n"
            + " Icon: %s\n"
            ,getName(),getPlace(),getDescription(),toStringDate(),
            getIcon()==null?"":getIcon().toString());
    a+="\nIvitados: ";
    if(guestList!=null)
    {
       for(Person p: guestList)
       {
           a+="\n"+p.getNombre()+" "+p.getCorreo();
       }
    }
    a+="\nAlarmas";
    
    if(alarm!=null)
    {
        for(Alarm al: alarm)
        {
            a+="\n"+al.getTipoAlarma()+" "+al.getDate();
        }
    }
    
      return a;
    }
}


