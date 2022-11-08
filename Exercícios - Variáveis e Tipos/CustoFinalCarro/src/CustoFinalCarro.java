import java.util.Scanner;

public class CustoFinalCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double porcentagemDistribuidor = 28;
        double impostos = 45;

        System.out.print("Entre com os custo de Fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoFinal = custoFabrica + (custoFabrica*porcentagemDistribuidor/100) + (custoFabrica*impostos/100);

        System.out.printf("O carro custará R$ %.2f ao consumidor final.", custoFinal);

        scanner.close();
    }
}
