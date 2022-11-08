import java.util.Scanner;

public class ValorVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o preço de custo do produto: ");
        double precoDeCusto = scanner.nextDouble();

        System.out.print("Entre com a margem de lucro em %: ");
        double margemLucro = scanner.nextDouble();

        double valorDeVenda = precoDeCusto + (precoDeCusto*margemLucro/100);

        System.out.printf("O valor de venda do produto é de R$ %.2f.", valorDeVenda);

        scanner.close();
    }
}
