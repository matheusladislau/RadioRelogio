package classes;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
public class InformaHora extends Thread{
    Player tocador;
    FileInputStream musica;
    static int musicaAtual;
    @Override
    public void run() {
        try{ 
            musica=new FileInputStream("src/audio/HRS"+new Tempo().getHoraAtual()+".mp3");
            tocador=new Player(musica);
            tocador.play();
            
            musica=new FileInputStream("src/audio/MIN"+new Tempo().getMinutoAtual()+".mp3");
            tocador=new Player(musica);
            tocador.play();
            }catch(Exception e){
                System.out.println(e);
        }
    }
}
