import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com dois números: ");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();

        System.out.printf("A soma de %.2f e %.2f é %.2f.\n", numero1, numero2, numero1+numero2);

        System.out.printf("A subtração de %.2f por %.2f é %.2f.\n", numero1, numero2, numero1-numero2);

        System.out.printf("A multiplicação de %.2f por %.2f é %.2f.\n", numero1, numero2, numero1*numero2);

        System.out.printf("A divisão de %.2f por %.2f é %.2f.", numero1, numero2, numero1/numero2);
    }
}
