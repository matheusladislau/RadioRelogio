package classes;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
//import java.io.FileNotFoundException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javazoom.jl.player.Player;
public class Tocador extends Thread{
    Player tocador;
    FileInputStream musica;
    static int musicaAtual;
    @Override
    public void run(){
        //leitura de todos arquivos de um diretório
        File diretorio=new File("src/musica/");
        File afile[]=diretorio.listFiles();

        Player tocador;
        FileInputStream musica;
        try{
            //musica = new FileInputStream("src/musicas/AC-DC - Back in Black.mp3");
            for(int i=0; i<afile.length; i++){
                musica=new FileInputStream(afile[i]);
                JOptionPane.showMessageDialog(null,"Tocando musica: "+afile[i]);
                tocador=new Player(musica);
                tocador.play(); 
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void atualizarPlayer(){
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
    public void setNMusicas(int n){
        this.musicaAtual=n;
    }
}
