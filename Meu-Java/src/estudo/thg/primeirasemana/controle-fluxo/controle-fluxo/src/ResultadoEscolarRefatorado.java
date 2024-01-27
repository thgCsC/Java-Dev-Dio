import java.util.Scanner;

public class ResultadoEscolarRefatorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do Aluno: ");

        double nota = sc.nextDouble();
        String resultado = nota >= 7 ? "Aluno Aprovado!"
                : nota >= 5 && nota < 7 ? "Aluno está de Recuperação!"
                        : "Aluno está Reprovado.";

        System.out.println(resultado);
        sc.close();
    }
}
