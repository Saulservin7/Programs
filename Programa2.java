import java.util.Timer;
import java.util.TimerTask;

public class Programa2 {

    public static void main (String[] args){
        
    Timer countDown = new Timer();
    TimerTask task = new TimerTask() {
        int seconds = 60;
        public void run() {
            if (seconds > 0){
                System.out.println(seconds);
                seconds--;
            }else{
                System.out.println("Finalizando Programa...");
                countDown.cancel();
                System.exit(0);
            }
        }
    };
    countDown.schedule(task, 0, 1000);
}
}
