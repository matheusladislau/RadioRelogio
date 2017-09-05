package classes;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
//import java.io.FileNotFoundException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javazoom.jl.player.Player;
public class TocadorMusica extends Thread{
    static File musica;
    static boolean tocando=false;
//
    public TocadorMusica(File musica){
        this.musica=musica;
    }
    @Override
    public synchronized void run(){
        
        while(tocando){
            try{
                wait(); 
            }catch(InterruptedException e){
            }
        }

        this.tocando=true;
        File file=new File("src/musica/");
            File afile[]=file.listFiles();   
            Player tocador;
            FileInputStream musica;
            try{
                //musica = new FileInputStream("src/musica/Back in Black.mp3");
                musica=new FileInputStream(this.musica);
                tocador=new Player(musica);

                tocador.play();
                //System.out.println("Tocando agora "+this.musica.getName());
            } catch (Exception e){
                System.out.println(e);
            }
            this.tocando=false;
            notifyAll();
    }
    public void parar(){
        this.tocando=false;
        stop();
    }
}