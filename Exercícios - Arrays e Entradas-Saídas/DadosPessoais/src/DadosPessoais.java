import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone com DDD: ");
        String telefone = scanner.nextLine();

        System.out.println("Seus dados pessoais:");
        System.out.println(nomeCompleto);
        System.out.println(endereco);
        System.out.println(cep + " " + telefone);

        scanner.close();
    }
}
