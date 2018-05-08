/**
 *
 * @author Andres
 */
public class Alarm {
    String tipoAlarma;
    Date diaNotificacion;

    public String getTipoAlarma() {
        return tipoAlarma;
    }

    public void setTipoAlarma(String tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public Date getDiaNotificacion() {
        return diaNotificacion;
    }

    public void setDiaNotificacion(Date diaNotificacion) {
        this.diaNotificacion = diaNotificacion;
    }

    public Alarm(String tipoAlarma, Date diaNotificacion) {
        this.tipoAlarma = tipoAlarma;
        this.diaNotificacion = diaNotificacion;
    }
    
}
