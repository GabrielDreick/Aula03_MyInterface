
public class Conta {
    private String nome;
    private int agencia;
    private long numconta;
    private double saldo;
    

    
    
    
    private void print(String txt){
        System.out.println(txt);
        //System.out.printf(txt, args);
    }
    
    
    //SETTERS
    public void setNome(String name){
        this.nome = name;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setNumconta(long numconta){
        this.numconta = numconta;
    }
    public void setSaldo(double newSaldo){
        this.saldo = newSaldo;
    }
    
    //GETTERS
    public String getName(){
        return this.nome;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public long getNumconta(){
        return this.numconta;
    }
    public double getSaldo(){
        return this.saldo;
    }
}