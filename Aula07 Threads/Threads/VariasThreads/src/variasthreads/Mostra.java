
package variasthreads;
/*
import java.util.logging.Level;
import java.util.logging.Logger;
*/


/**
 *
 * @author Gabriel Dreick
 */
public class Mostra implements Runnable {
    public int i;
    private static int cont = 0;
    private int id;
    private int step;
    private int maxNumber;
    //private int n;
    
    
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    
    public void run() {
        
        while(i < maxNumber) {
       
            i++;
            for (int c = 0; c < (step-1); c++){
                i++;
            }
            if (i > maxNumber){
                System.out.println(RED+"Processo #"+id+"; Numero Maximo excedido. Interrompendo.");
                break;
            }
            
            System.out.println("Processo "+id+"; Numero: "+ i);
            if (i == maxNumber) {
                System.out.println(GREEN+"Processo #"+id+" Finalizado.");
            }
        }
    }
    public Mostra(int maxNumber,int step) {
        this.step = step;
        this.maxNumber = maxNumber;
        cont++;
        id = cont;
        }
}

