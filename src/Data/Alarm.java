
package Data;


import java.io.Serializable;
import java.util.Date;

/**
 * FINAL()
 * @authors Andres Ardila, Esteban Ladino, Ivan Solano
 */
public class Alarm implements Serializable  {
    private static final long serialVersionUID= 112233445566778899l;
    private String tipoAlarma;
    private Date date;
    private boolean activated;
    
    //Getters and setters
    public Alarm(String tipoAlarma, Date date) {
        this.tipoAlarma = tipoAlarma;
        this.date = date;
        activated=false;
    }   
    
     public Alarm()
     {
        this.tipoAlarma="";
        this.date= null;
        activated=false;
     }
    
    
    public String getTipoAlarma() {
        return tipoAlarma;
    }

    public void setTipoAlarma(String tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setActivated() {
        this.activated = true;
    }

    //Comparadores
    public boolean isActivated() {
        return activated;
    }

    public boolean isExpire(){
        Date auxDate=new Date();
        return auxDate.compareTo(date)==1;
    }
    
    @Override
    public String toString() {
            return date + " Tipo de alarma:" + tipoAlarma;
        }

}
    

    
    

