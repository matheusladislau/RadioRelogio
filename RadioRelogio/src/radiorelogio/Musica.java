/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiorelogio;
/**
 *
 * @author a1600079
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
}
