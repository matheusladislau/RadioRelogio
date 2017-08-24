/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author a1600079
 */
public class Hora extends Thread{
    String hora;
    @Override
    public void run(){
        while(true){
            try{
                this.hora=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getHora(){
        this.hora=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return this.hora;
    }
    
}
  

