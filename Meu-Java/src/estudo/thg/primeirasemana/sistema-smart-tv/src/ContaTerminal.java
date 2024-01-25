import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int Numero;
            // String Agencia;
            // String nomeCliente;
            // double Saldo;

            System.out.println("Por favor, digite o número da sua Conta: ");
            int Numero = sc.nextInt();

            System.out.println("Por favor, digite o número da Agência: ");
            String Agencia = sc.nextLine();

            System.out.println("Por favor, digite o valor que deseja depositar: ");
            double Saldo = sc.nextDouble();

            System.out.println("Por favor, digite o seu nome completo: ");
            String nomeCliente = sc.nextLine();

            System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + Agencia + ", conta" + Numero + "e seu saldo ", Saldo, "já está disponível para saque.");
        }
    }
}
