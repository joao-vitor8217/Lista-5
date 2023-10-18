import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // verifica se o número é positivo
        if (numero > 0) {
            System.out.println("Números ímpares de 1 até " + numero + ":");
            // imprime os números ímpares de 1 até o número informado
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }

        scanner.close();
    }
}