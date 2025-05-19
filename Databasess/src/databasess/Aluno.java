package databasess;

public class Aluno {
    private String matricula;
    private String nome;
    private int ano;
    
    public Aluno(){}
    
    public Aluno(String matricula, String nome, int ano){
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
    }


    public String get_matricula() {
        return matricula;
    }
    
    public void set_matricula(String matricula) {
        this.matricula = matricula;
    }

    
    public String get_nome() {
        return nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }
     
    
    public int get_ano() {
        return ano;
    }

    public void set_ano(int ano) {
        this.ano = ano;
    }
    
}
