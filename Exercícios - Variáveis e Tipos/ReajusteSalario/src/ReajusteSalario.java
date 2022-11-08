import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        double reajute = 0.07;
        double salarioReajustado = salarioAtual + salarioAtual*reajute;

        System.out.printf("Salário anterior: R$ %.2f", salarioAtual);
        System.out.printf("\nNovo salário: R$ %.2f", salarioReajustado);

        scanner.close();
    }
}
