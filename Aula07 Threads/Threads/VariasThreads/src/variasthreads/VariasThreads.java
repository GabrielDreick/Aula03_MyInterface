package variasthreads;

/**
 *
 * @author Gabriel Dreick
 */
public class VariasThreads {
    public static void main(String[] args) {
        
        Runnable r1 = new Mostra(40, 1);
        Runnable r2 = new Mostra(30, 1);
        Runnable r3 = new Mostra(20, 3);
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
    }
    
}
