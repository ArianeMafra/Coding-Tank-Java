public class ParOuImpar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);

        if (numero %2 == 0) {
            System.out.println("Numero Par!");
        } else {
            System.out.println("Numero Impar!");
        }
    }
}
