import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular os dias vividos, digite sua idade em anos, meses e dias.");
        System.out.print("Anos: ");
        int anos = scanner.nextInt();
        System.out.print("Meses: ");
        int meses = scanner.nextInt();
        System.out.print("Dias: ");
        int dias = scanner.nextInt();

        int diasVividos = anos * 365 + meses * 30 + dias;

        System.out.printf("Você já viveu %d dias.", diasVividos);

        scanner.close();
    }
}
