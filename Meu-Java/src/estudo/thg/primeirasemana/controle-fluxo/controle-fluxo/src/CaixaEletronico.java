import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe o valor que deseja sacar: ");
        double saldo = 25.0;
        double valorSolicitado = sc.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;

            System.out.printf("Seu saldo é R$ %.2f", saldo);
        } else {
            System.out.printf("Saldo insuficiente!\nSeu saldo atual é: R$ %.2f", saldo);
        }
        sc.close();
    }
}
