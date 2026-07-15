import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o subtotal da compra: R$ ");
        double subtotal = sc.nextDouble();

        NotaFiscal nota = new NotaFiscal(subtotal);

        nota.emitirNota();

        sc.close();
    }
}