//encapsulamento */
//public
//private
//protected
//package
public class Aluno {
    
    //variaveis= atributos
    //caracteristicas do objeto
    private String nome;
    private int idade;
    private boolean temFaculdade;

    public Aluno(){

    }
    public Aluno(String nome,int idade, boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;

    }
    //classes wrapper
    /*
     * tipo primitivo x classes wrappers
     * 
     * você tem que descobrir quantos alunos tem faculdade (sim ou não)
     */
    public String getNome(){ //método para pegar o nome
        return nome;
    }
    public int getIdade(){ //método para pegar a idade
        return idade;
    }
    public boolean getTemFaculdade(){ //método para pegar trmFaculdade
        return temFaculdade;
    }
    

}
