import java.util.Scanner;

public class ResultadoEscolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aluno Aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("O aluno está de Recuperação!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
        sc.close();
    }
}
