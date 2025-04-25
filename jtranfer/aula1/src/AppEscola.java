import java.util.Scanner;

public class AppEscola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //interface
        String nome;
        int idade;
        boolean temFaculdade;
     

        System.out.println( "   Qual é o seu Nome?");
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("   Qual é a sua idade?");
        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();
        System.out.println( "   Tem Faculdade?");
        System.out.println("0=não e 1=sim");
        temFaculdade = scanner.nextBoolean();

        
        //método principal
        //classe objeto = new Construtor(parametros);
        Aluno aluno = new Aluno(nome, idade, temFaculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());

         
        
    }
}
