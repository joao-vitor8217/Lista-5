import java.util.Scanner;

public class PotenciaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int base = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (expoente): ");
        int expoente = scanner.nextInt();

        // verifica se o expoente é negativo
        if (expoente < 0) {
            System.out.println("Expoente negativo não é suportado para este exemplo.");
        } else {
            // calcula a potência usando apenas multiplicação
            int resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }

            // imprime o resultado
            System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        }

        scanner.close();
    }
}