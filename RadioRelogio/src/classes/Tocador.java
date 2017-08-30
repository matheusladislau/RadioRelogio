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
            musica=new FileInputStream(afile[musicaAtual]);
            JOptionPane.showMessageDialog(null,"Tocando musica: "+afile[musicaAtual]);
            tocador=new Player(musica);
            tocador.play(); 
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void setMusicaAtual(int valor){
        this.musicaAtual=valor;
    }
}
