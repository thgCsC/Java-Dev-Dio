package estudo.thg.primeirasemana;

import java.util.Scanner;

public class BoletimEstudante {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota do aluno:");
        float nota2 = sc.nextFloat();

        float mediaFinal = (nota1 + nota2) / 2;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("O ALUNO ESTÁ DE RECUPERAÇÃO");
        else
            System.out.print("Nota: " + mediaFinal + "\n" +
                    "ALUNO APROVADO.");
    }
}
// IMPLEMENTAR ESSE ALGORITMO AINDA MAIS =D
// adicionar um imput - Implementado √