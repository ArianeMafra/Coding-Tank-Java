import java.util.Scanner;

public class CombustivelNecessario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumoVeiculo = 12.00;

        System.out.println("Qual o tempo, em horas, gasto na viagem? ");
        double tempoGasto = scanner.nextDouble();

        System.out.println("Qual a velocidade média do veículo (Km/h)?");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;

        double litrosUsados = distancia / consumoVeiculo;

        System.out.printf("A quantidade de combustível necessários para essa viagem é de %.2f Litros", litrosUsados);
    }
}
