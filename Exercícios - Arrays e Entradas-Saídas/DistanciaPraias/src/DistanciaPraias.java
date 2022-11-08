import java.util.Scanner;

public class DistanciaPraias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String praia [] = new String [5];
        double distanciaDoHotel [] = new double [5];
        double maiorDistancia = 0;
        double somaDistancias = 0;
        int praiasEntre10e15Km = 0;
        String praiaMaisDistante = "";

        System.out.println("Cadastro das praias e suas distâncias do hotel.");

        for (int i = 0; i < praia.length; i++) {
            System.out.println("Nome da praia: ");
            praia[i] = scanner.nextLine();
        }
        for (int i = 0; i < distanciaDoHotel.length; i++) {
            System.out.printf("Qual a distância da praia %s: ", praia[i]);
            distanciaDoHotel[i] = scanner.nextDouble();

            somaDistancias += distanciaDoHotel[i];

            if (distanciaDoHotel[i] > maiorDistancia) {
                maiorDistancia = distanciaDoHotel[i];
                praiaMaisDistante = praia[i];
            }

            if ((distanciaDoHotel[i] > 10.00) && (distanciaDoHotel[i] < 15.00)) {
                praiasEntre10e15Km += 1;
            }
        }

        System.out.println("Praia mais distante: " + praiaMaisDistante );
        System.out.printf("Existem %d praias a mais de 10 km e a menos de 15 km.", praiasEntre10e15Km);
        System.out.printf("A distância média das praias é de %.2f Km.", (somaDistancias/distanciaDoHotel.length));


        scanner.close();
    }
}

