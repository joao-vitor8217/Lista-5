public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0;

        // calcula a soma dos números de 7 a 20
        for (int i = 7; i <= 20; i++) {
            soma += i;
        }

        // imprime o resultado
        System.out.println("A soma dos números de 7 a 20 é: " + soma);
    }
}