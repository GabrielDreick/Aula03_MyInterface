
/**
 *
 * @author Gabriel Dreick
 */
public class Encapsulamento {

    public static void main(String[] args) {
        Conta conta = new Conta();
        
        /* didn't work
        for(int n = 0; n < 4; n++){
            conta[n].setNome("nome"+(n+1));
            conta[n].setAgencia((n+1)*2);
            conta[n].setNumconta(2213+(n+1)*(n+1));
            conta[n].setSaldo((n+1)*2496.27);
        }
        System.out.println("=========================");
        for (int n = 0; n < conta.length(); n++){
            System.out.println("Nome: " +conta[n].getName());
            System.out.println("Agencia: " +conta[n].getAgencia());
            System.out.println("Numero Conta: " +conta[n].getNumconta());
            System.out.println("Saldo: " +conta[n].getSaldo());
            System.out.println("=========================");
        } 
        */
        
        conta.setNome("Gabriel");
        System.out.println("Nome: " +conta.getName());
        
        conta.setAgencia(2);
        System.out.println("Agencia: " +conta.getAgencia());
        
        conta.setNumconta(123123);
        System.out.println("Numero Conta: " +conta.getNumconta());
    
        conta.setSaldo(5689.25);
        System.out.println("Saldo: " +conta.getSaldo());
        
    }
    
}
