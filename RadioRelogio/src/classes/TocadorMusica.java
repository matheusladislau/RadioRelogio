package classes;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
//import java.io.FileNotFoundException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javazoom.jl.player.Player;
public class TocadorMusica extends Thread{
    @Override
    public void run(){
        // leitura de todos arquivos de um diretório
        File file = new File("src/musica/");
        File afile[] = file.listFiles();
        System.out.println(afile[1]);


        Player tocador;
        FileInputStream musica;
        try{
            //musica = new FileInputStream("src/musica/Back in Black.mp3");
            musica=new FileInputStream(afile[1]);
            tocador=new Player(musica);
            tocador.play();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}