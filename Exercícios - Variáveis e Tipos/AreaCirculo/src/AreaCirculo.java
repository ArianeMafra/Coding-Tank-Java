import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Para calcular a área do círculo entre com o raio em metros: ");
        double raioCirculo = scanner.nextDouble();

        double areaCirculo = Math.PI * (raioCirculo * raioCirculo);

        System.out.printf("Área = %.2f m²", areaCirculo);

        scanner.close();
    }
}
