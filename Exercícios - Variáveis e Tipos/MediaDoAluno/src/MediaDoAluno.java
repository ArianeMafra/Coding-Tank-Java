import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.printf("Digite a primeira nota do aluno %s: ", nomeAluno);
        double nota1 = scanner.nextDouble();

        System.out.printf("Digite a segunda nota do aluno %s: ", nomeAluno);
        double nota2 = scanner.nextDouble();

        System.out.printf("Digite a terceira nota do aluno %s: ", nomeAluno);
        double nota3 = scanner.nextDouble();

        double mediaAluno = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno %s é %.2f.", nomeAluno, mediaAluno);

        scanner.close();
    }
}
