package classes;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javazoom.jl.player.Player;
public class Musica extends Thread{
    Player tocador;
    FileInputStream musica;
    @Override
    public void run(){
        try{
            musica=new FileInputStream("src/musica/Back in Black.mp3");
            tocador=new Player(musica);
            tocador.play();
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void falar(String hora){
        try{ 
            musica=new FileInputStream("src/audio/"+hora+".mp3");
            tocador=new Player(musica);
            tocador.play();
            }catch(Exception e){
                System.out.println(e);
        }
    }
}
