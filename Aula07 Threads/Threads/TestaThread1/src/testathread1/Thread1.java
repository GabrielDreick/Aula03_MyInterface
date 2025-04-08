
package testathread1;

/**
 *
 * @author aluno
 */
public class Thread1 {
    private int i;
    
    public void run(){
        while(i <= 10)
            System.out.println("numero: "+i++);
    }
}
