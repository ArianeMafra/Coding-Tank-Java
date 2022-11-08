import java.util.Scanner;

public class QuantidadeCavalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular quantidade de cavalos, entre com ");
        System.out.println("* a massa em Kilogramas :");
        double massa = scanner.nextDouble();

        System.out.println("* a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.println("* o tempo em segundos: ");
        double tempo = scanner.nextDouble();

        scanner.close();

        double cavalos = (massa * altura / tempo) / 745.6999;

        System.out.printf("A quantidade de Cavalos é %.2f.", cavalos);
    }
}
