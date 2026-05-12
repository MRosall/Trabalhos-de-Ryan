import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String email;
        int idade;
        int cpf;

        System.out.println("===== SISTEMA DE CADASTRO =====");

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        email = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite seu CPF: ");
        cpf = scanner.nextInt();

        System.out.println("\n===== DADOS CADASTRADOS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);

        scanner.close();
    }
}
