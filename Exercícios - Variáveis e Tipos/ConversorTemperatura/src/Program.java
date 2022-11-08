import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsiu que deseja converter: ");
        double temperaturaCelsius = scanner.nextDouble();

        Conversao.menuConversao();
        int opcaoEscolhida = scanner.nextInt();

        switch (opcaoEscolhida){
            case 1: 
            System.out.printf("A temperatura em Kelvin é %.2f.", Conversao.converterParaKelvin(temperaturaCelsius));
            break;

            case 2:
            System.out.printf("A temperatura em Fahrenheit é %.2f.", Conversao.converterParaFahrenheit(temperaturaCelsius));
            break;

            case 3:
            System.out.printf("A temperatura em Rankine é %.2f.", Conversao.converterParaRankine(temperaturaCelsius));
            break;

            case 4:
            System.out.printf("A temperatura em Réaumur é %.2f.", Conversao.converterParaReaumur(temperaturaCelsius));
            break;

            default:
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}