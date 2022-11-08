import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com dois números para fazer a operação:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();

        menuOperacoes();
        int operacao = scanner.nextInt();

        switch (operacao){
            case 1:
            System.out.println("A soma é " + (numero1+numero2));
            break;

            case 2:
            System.out.println("A subtração é " + (numero1-numero2));
            break;

            case 3:
            System.out.println("A divisão é " + (numero1/numero2));
            break;

            case 4:
            System.out.println("A multiplicação é " + (numero1*numero2));
            break;
            
            default:
            System.out.println("Operação inválida!");
        }
        scanner.close();
    }

    public static void menuOperacoes() {
        System.out.println("Escolha a operação que deseja fazer.");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4- Multiplicação");
    }
}
