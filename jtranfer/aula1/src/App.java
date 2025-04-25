import java.io.FileWriter; // Classe para escrever no arquivo
import java.io.IOException;// Classe para tratar exceções do arquivo
import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception {
        //declarção de variáveis
        String nome; //referencia
        int opcaoTransporte;
        String meioTransporte = "";

        //classe para teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println( "== Pesquisa de transporte Diário");
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("Como você vai ao trabalho?");

    //utf-8
    System.out.println("1-Metrô");
    System.out.println("2-ônibus");
    System.out.println("3-caminhada");
    System.out.println("4-uber");
    System.out.println("5-taxi");
    System.out.println("6-Carro Próprio");
    System.out.println("Escolha uma opção (1-6)");

    //exercicio
    //leia a opcaoTransporte


    opcaoTransporte = scanner.nextInt();

    switch (opcaoTransporte) {
        case 1:
            
            meioTransporte = "Metrô";break;
        case 2:
            meioTransporte = "Ônibus";break;
        case 3:    
        meioTransporte = "caminhada";break;
        case 4: 
        meioTransporte = "uber";break;
        case 5:
        meioTransporte = "taxi";break;
        case 6:
        meioTransporte = "carro";break;
    
        default:
            break;
    }
    //Task de amanhã: salvar os dados no arquivo.
    //Task no GitHub (git e github).
    System.out.println("Nome:  "+nome+","+"Meio do Transporte:  "+meioTransporte);

    
try (FileWriter escritor = new FileWriter("dados.txt", true)){
    escritor.write(nome+","+meioTransporte+"\n");
    System.out.println("dados gravados com sucesso");
    
} catch (IOException e) {
    System.out.println("Erro ao gravar os dados"+e.getMessage());

  
}

}



}


