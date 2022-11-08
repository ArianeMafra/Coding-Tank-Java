import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em reais que deseja converter: ");
        double valorEmReal = scanner.nextDouble();

        menuMoeda();
        int opcaoMenu = scanner.nextInt();

        switch (opcaoMenu) {
            case 1: 
            System.out.print("Entre com a cotação do dólar: ");
            double cotacaoDolar = scanner.nextDouble();

            System.out.printf("O valor em dólar é $ %.2f.", converterParaDolar(valorEmReal, cotacaoDolar));
            break;

            case 2:
            System.out.print("Entre com a cotação do euro: ");
            double cotacaoEuro = scanner.nextDouble();

            System.out.printf("O valor em dólar é $ %.2f.", converterParaEuro(valorEmReal, cotacaoEuro));
            break;

            case 3:
            System.out.print("Entre com a cotação da libra: ");
            double cotacaoLibra = scanner.nextDouble();

            System.out.printf("O valor em dólar é $ %.2f.", converterParaLibra(valorEmReal, cotacaoLibra));
            break;

            default:
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private static void menuMoeda() {
        System.out.println("Para qual moeda deseja fazer a conversão?");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
    }

    private static double converterParaDolar(double valorEmReal, double cotacaoDolar) {
        double valorEmDolar = valorEmReal * cotacaoDolar;
        return valorEmDolar;
    }

    private static double converterParaEuro(double valorEmReal, double cotacaoEuro) {
        double valorEmEuro = valorEmReal * cotacaoEuro;
        return valorEmEuro;
    }

    private static double converterParaLibra(double valorEmReal, double cotacaoLibra) {
        double valorEmLibra = valorEmReal * cotacaoLibra;
        return valorEmLibra;
    }
}
