import java.util.Scanner;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância percorrida pelo automóvel em Kilometros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto pelo automóvel em Litros: ");
        double totalCombustivel = scanner.nextDouble();

        double consumoMedioCombustivel = distancia/totalCombustivel;

        System.out.printf("O consumo médio de combustível do automóvel é de %.2f Km/L.", consumoMedioCombustivel);

        scanner.close();
    }
}
