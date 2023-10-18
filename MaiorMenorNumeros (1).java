import java.util.Scanner;

public class MaiorMenorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variáveis para armazenar o maior e o menor número
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // loop para ler 10 números e encontrar o maior e o menor
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número inteiro #" + i + ": ");
            int numero = scanner.nextInt();

            // atualiza o maior e o menor número, se necessário
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // imprime o maior e o menor número
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}