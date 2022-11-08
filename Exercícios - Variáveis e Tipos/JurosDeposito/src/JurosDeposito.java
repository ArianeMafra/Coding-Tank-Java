import java.util.Scanner;

public class JurosDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Entre com o valor do depósito: ");
       double deposito = scanner.nextDouble();

       double taxaDeJurosMensal = 0.0070;
       int tempoEmprestimoMeses = 1;

       double valorFinal = deposito * Math.pow((1 + taxaDeJurosMensal), tempoEmprestimoMeses);

       System.out.printf("Após 1 mês, o valor do depósito corrigido com juros será de: R$ %.2f.", valorFinal);

       scanner.close();
    }
}
