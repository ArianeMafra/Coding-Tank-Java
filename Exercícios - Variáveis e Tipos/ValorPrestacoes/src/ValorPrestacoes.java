import java.util.Scanner;

public class ValorPrestacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra para calcular as prestações: ");
        double totalCompra = scanner.nextDouble();
        int numeroPrestacao = 5;

        double valorPrestacoes = totalCompra / numeroPrestacao;

        System.out.printf("Compra no valor de R$ %.2f, parcelado em 5X de R$ %.2f.", totalCompra, valorPrestacoes);

        scanner.close();
    }
}
