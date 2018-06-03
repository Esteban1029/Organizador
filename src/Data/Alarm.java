
package Data;


import java.io.Serializable;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Andres
 */
public class Alarm implements Serializable  {
    private static final long serialVersionUID= 112233445566778899l;
    private String tipoAlarma;
    private Date date;
    private boolean activated;
    

    
    public Alarm(String tipoAlarma, Date date) {
        this.tipoAlarma = tipoAlarma;
        this.date = date;
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
    

    public boolean isActivated() {
        return activated;
    }
        
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    
    
    public boolean isExpire()
    {
        Date auxDate=new Date();
        return auxDate.compareTo(date)==1;
    }
    
    

    public static void notificacionCorreo(String destino, String usuario, String nombreInvitado, String eventName, String date, String descripcion){
        String remitente = "meetingmanagerpoo";
        String clave ="POOAponte1";
        
        String asunto ="MEETING FROM: "+usuario;
        String cuerpo ="Hello "+nombreInvitado+",\n"+
        "\n" +
        "You have been invited to "+eventName+ " by "+usuario+" on "+date+" where "+descripcion+" \n" +
        "\n" +
        "Thanks,\n" +
        "MeetingManager";
        
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave);    //La clave de la cuenta
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
        
        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        
        try{
            message.setFrom(new InternetAddress(remitente));
            
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));   //Se podrían añadir varios de la misma manera
            message.setSubject(asunto);
            message.setText(cuerpo);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }catch(MessagingException me){
            me.
                    printStackTrace();

        }

     }
    
        @Override
        public String toString() {
            return date + " Tipo de alarma:" + tipoAlarma;
        }

}
    

    
    

