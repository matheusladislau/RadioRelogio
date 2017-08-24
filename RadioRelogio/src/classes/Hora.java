package classes;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hora extends Thread{
    String horaCompleta;
    String hora;
    String minuto;
    @Override
    public void run(){
        while(true){
            try{
                this.horaCompleta=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
                this.hora=new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String getHoraCompleta(){
        this.horaCompleta=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return this.horaCompleta;
    }
    public String getHora(){
        this.hora=new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
        Calendar c=Calendar.getInstance();
        return this.hora;
    }
    public String getMinuto(){
        this.hora=new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
        Calendar c=Calendar.getInstance();
        return this.hora;
    }
}
  

