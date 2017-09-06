package classes;
public class Tocador extends Thread{
    static TocadorMusica musica;
    static boolean tocando=false;
    @Override
    public synchronized void run(){
        if(this.tocando){
            
        }
        this.tocando=false;
        this.musica.start();
        notifyAll();
    }
    public void parar(){
        this.musica.stop();
    }
}
