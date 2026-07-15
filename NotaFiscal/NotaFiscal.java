public class NotaFiscal {

    double subtotal;
    double desconto;
    double frete;
    double total;

    public NotaFiscal(double subtotal) {
        this.subtotal = subtotal;
        calcularDesconto();
        calcularFrete();
        calcularTotal();
    }

    void calcularDesconto() {
        if (subtotal <= 100) {
            desconto = 0;
        } else if (subtotal <= 200) {
            desconto = subtotal * 0.05;
        } else {
            desconto = subtotal * 0.10;
        }
    }

    void calcularFrete() {
        if (subtotal > 200) {
            frete = 0;
        } else {
            frete = 25;
        }
    }

    void calcularTotal() {
        total = subtotal - desconto + frete;
    }

    void emitirNota() {
        System.out.println("\n===== NOTA FISCAL =====");
        System.out.printf("Subtotal : R$ %.2f%n", subtotal);
        System.out.printf("Desconto : R$ %.2f%n", desconto);
        System.out.printf("Frete    : R$ %.2f%n", frete);
        System.out.printf("Total    : R$ %.2f%n", total);
    }
}