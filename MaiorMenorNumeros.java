import java.util.Scanner;

public class MaiorMenorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variáveis para armazenar o maior e o menor número
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // loop para ler números e encontrar o maior e o menor
        while (true) {
            System.out.print("Digite um número inteiro (ou 0 para encerrar): ");
            int numero = scanner.nextInt();

            // verifica se o usuário deseja encerrar
            if (numero == 0) {
                break;
            }

            // atualiza o maior e o menor número, se necessário
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // verifica se pelo menos um número foi inserido
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            // imprime o maior e o menor número
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }

        scanner.close();
    }
}