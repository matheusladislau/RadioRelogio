package classes;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
public class InformaHora extends Thread{
    @Override
    public void run(){
        Player tocador;
        FileInputStream musica;
        try{
            musica=new FileInputStream("src/audio/HRS"+new Tempo().getHoraAtual()+".mp3");
            tocador=new Player(musica);
            tocador.play();
            //
            musica=new FileInputStream("src/audio/MIN"+new Tempo().getMinutoAtual()+".mp3");
            tocador=new Player(musica);
            tocador.play();
            }catch(Exception e){
                System.out.println(e);
        }
    }
}
