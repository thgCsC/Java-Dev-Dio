
/*
  -  ToDo: Conhecer e importar a classe Scanner
  -  Exibir as mensagens para o nosso usuário
  -  Obter pela scanner os valores digitados no terminal
  -  Exibir a mensagem conta criada
*/
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta" + Numero + "e seu saldo ", Saldo, "já está disponível para saque.");
    }
}
