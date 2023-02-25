// import modulos.Book;
import modulos.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {

        Scanner stdin = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        String nome = "", cpf = "";
        int idade = 0;

        System.out.printf("Digite o nome: ");
        nome = stdin.next();

        System.out.printf("Digite o cpf: ");
        cpf = stdin.next();

        System.out.printf("Digite a idade: ");
        idade = stdin.nextInt();


        p1.setNome(nome);
        p1.setIdade(idade);
        p1.setCpf(cpf);


        System.out.println("nome: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
        System.out.println("CPF: " + p1.getCpf());
    }
}
