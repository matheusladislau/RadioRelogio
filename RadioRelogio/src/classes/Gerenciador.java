package classes;
import java.util.ArrayList;
import java.io.File;
public class Gerenciador extends Thread{
    static TocadorMusica tocador;
    static File arquivoMusica;
    static ArrayList<File> musicas;
    static int nMusica;
//
    public Gerenciador(TocadorMusica t,File f){
        this.tocador=t;
        this.arquivoMusica=f;

    }
    public Gerenciador(TocadorMusica t,ArrayList<File> musicas){
        this.tocador=t;
        this.musicas=musicas;
    }

    @Override
    public void run(){
        for (int i=nMusica; i<musicas.size(); i++) {
            tocador.tocar(musicas.get(i));         
        }
    }
    public void parar(){
        tocador.parar();
        stop();
    }

    public void setMusica(File f){
        this.arquivoMusica=f;
    }  
    public void atualizarMusicas(ArrayList<File> array){
        this.musicas=array;
    }
    public void setMusica(int nMusica){
        this.nMusica=nMusica;
        this.arquivoMusica=musicas.get(nMusica);
    }
    
}
