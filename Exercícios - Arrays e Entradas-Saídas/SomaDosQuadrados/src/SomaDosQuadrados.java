import java.util.Scanner;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeros[] = new double [4];
        double somaQuadrados = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextDouble();

            somaQuadrados += (numeros[i] * numeros[i]);
        }
        scanner.close();

        System.out.println("A soma do quadrado dos números informados é: " + somaQuadrados);
    }
}
