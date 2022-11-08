import java.util.Scanner;

public class QntFerraduras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos cavalos foram comprados?");
        int qntCavalos = scanner.nextInt();

        System.out.printf("São necessárias %d ferraduras.", (qntCavalos * 4));

        scanner.close();
    }
}
