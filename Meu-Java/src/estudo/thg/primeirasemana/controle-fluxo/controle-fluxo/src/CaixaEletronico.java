public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 25.0;

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        } else {
            System.out.println("Seu saldo é insuficiente!\nSeu saldo atual é: R$ " + saldo);
        }
    }
}