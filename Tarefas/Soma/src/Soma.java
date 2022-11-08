import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch (args.length) {
            case 0:
            System.out.printf("Soma = %d", + naoRecebeuNumeros(scanner));
            
            break;

            case 1:
            System.out.printf("Soma = %d", + recebeuUmNumero(scanner, args[0]));
            break;

            case 2:
            System.out.printf("Soma = %d", + recebeuDoisNumeros(args[0], args[1]));
            break;

            default:
            System.out.println("A quantidade de numeros invalida!");

        }
    }
    
    public static int naoRecebeuNumeros(Scanner scanner) {
        System.out.println("Informe dois numeros para fazer a soma.");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        return numero1 + numero2;
        
    }

    public static int recebeuUmNumero(Scanner scanner, String primeiroNumero) {
        System.out.println("Informe mais um numero para fazer a soma.");
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = scanner.nextInt();

        return numero1 + numero2;  
    }

    public static int recebeuDoisNumeros(String primeiroNumero, String SegundoNumero) {
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(SegundoNumero);

        return numero1 + numero2;  
    }
}


