
package threadbasica;

/**
 *
 * @author Gabriel Dreick
 */
public class ThreadBasica extends Thread {
    private final String cor_clean = "\u001B[0m";
    private final String cor;
    
    private static int cont = 0;
    private final int id;
    
    private final int nMaximo;
    private final int passo;
    
    public ThreadBasica (String nome, int nMaximo, int passo) {
        super(nome);
        
        cont++;
        id = cont;
        
        if (id < 7){
            this.cor = "\u001B[3"+id+"m";
        }
        else{
            this.cor = this.cor_clean;
        }
        this.nMaximo = nMaximo;
        this.passo = passo;
        
    }
    
    public void slp(long time){
        try{
            sleep((long)(time));
            }catch(InterruptedException x){}
    }
    
    @Override
    public void run(){
        for (int i = 0; i <= this.nMaximo; i=i+this.passo) {
            System.out.println("Processo: "+id+", Iteracao: "+i+"\n"+this.cor+getName()+this.cor_clean+"\n");
            slp(500);
        }
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("-- Iniciando Threads --");
        try{sleep((long)(1000));}catch(InterruptedException x){};
        new ThreadBasica("<Gabriel Dreick>", 10, 1).start();
        new ThreadBasica("Joao", 10, 1).start();
        new ThreadBasica("Daniel", 10, 1).start();
        new ThreadBasica("Simone", 10, 1).start();
        new ThreadBasica("Marcio", 10, 1).start();
        new ThreadBasica("Ana", 10, 1).start();
        new ThreadBasica("Giovanna", 10, 1).start();
        new ThreadBasica("Miguel", 10, 1).start();
        new ThreadBasica("Angela", 10, 1).start();
        new ThreadBasica("Felipe", 10, 1).start();
       
    }
    
}
