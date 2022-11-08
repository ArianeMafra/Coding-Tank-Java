import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[3];
        double somaNotas = 0;

        System.out.print("Insira o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.printf("Informe a turma do aluno %s: ", aluno);
        String turma = scanner.nextLine();

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota aluno: ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        System.out.printf("Aluno: %s", aluno);
        System.out.printf("\nTurma: %s", turma);
        System.out.printf("\nMédia: %.2f", somaNotas/notas.length);

        scanner.close();
    }
}
