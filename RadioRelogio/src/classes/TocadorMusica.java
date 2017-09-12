package classes;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;
public class TocadorMusica extends Thread{
    static File musica;
    static boolean tocando=false;
//
    public TocadorMusica(){
        
    }
    public TocadorMusica(File f){
        this.musica=f;
    }
    @Override
    public void run(){
        File file=new File("src/musica/");
        File afile[]=file.listFiles();   
        Player tocador;
        FileInputStream musica;
        try{
            musica=new FileInputStream(this.musica);
            tocador=new Player(musica);
            tocador.play();
        } catch (Exception e){
            System.out.println(e);
            }
    }
    
    public synchronized void tocar(File arqMusica){
        while(tocando){
            try{
                wait();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        this.tocando=true;
        this.musica=arqMusica;
        run();
        this.tocando=false;
        notifyAll();
    }

    public void parar(){
        this.tocando=false;
        this.stop();
    }
}