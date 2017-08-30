package classes;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Tempo{
    //
    public String getHoraCompletaAtual(){
        return new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }
    public String getHoraAtual(){
        return new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
    }
    public String getMinutoAtual(){
        return new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
    }
}
  

