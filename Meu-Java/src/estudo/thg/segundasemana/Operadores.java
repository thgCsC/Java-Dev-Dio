package estudo.thg.segundasemana;

public class Operadores {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 5;

        /*
         * String resultado = "";
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // Uso de operdores ternario para substituir o bloco de codigo acima.
        // Obs: Isso não quer dizer que o bloco está errado!

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
