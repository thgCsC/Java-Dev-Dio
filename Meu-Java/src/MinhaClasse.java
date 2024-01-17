
// Anatomia das Classes

public class MinhaClasse {
    /*
     * public static void main(String[] args) {
     * System.out.println("Olá, Seja bem vindo ao JAVA!");
     * }
     */

    // Declarar uma variável em Java segue sempre a seguinte estrutura:
    /*
     * ESTRUTURA
     * Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
     */

    // EXEMPLO
    public static void main(String[] args) {
        // int idade = 23;
        // double altura = 1.62;

        String primeiroNome = "Thiago";
        String segundoNome = "Costa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Metodo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
