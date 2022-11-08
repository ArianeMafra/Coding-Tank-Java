import java.util.Scanner;
import java.lang.Math;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double taxaDeJuros = 0.02;

        System.out.println("Sistema de calculo de Juros Composto.");
        System.out.println("Digite o valor que deseja emprestar: ");
        double valorEmprestado = scanner.nextDouble();

        System.out.println("Em quantos meses o pagamento será feito? ");
        double tempoEmprestimo = scanner.nextDouble();

        double valorFinal = valorEmprestado * Math.pow((1 + taxaDeJuros), tempoEmprestimo);

        System.out.printf("Ao final de %.0f meses, o valor a pagar após a aplicação de juros será de R$ %.2f.", tempoEmprestimo, valorFinal);

        scanner.close();
    }
}
