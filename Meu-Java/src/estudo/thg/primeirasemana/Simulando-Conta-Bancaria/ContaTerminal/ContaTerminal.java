import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Numero;
            String Agencia, nomeCliente;
            double Saldo;

            System.out.println("Por favor, digite o número da sua Conta: ");
            Numero = sc.nextInt();

            System.out.println("Por favor, digite o número da Agência: ");
            Agencia = sc.nextLine();

            System.out.println("Por favor, digite o seu nome completo: ");
            nomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o valor que deseja depositar: ");
            Saldo = sc.nextDouble();

            System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + Agencia + ", conta" + Numero + "e seu saldo ", Saldo, "já está disponível para saque.");
        }
    }
}
