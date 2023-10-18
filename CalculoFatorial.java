import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita um número natural ao usuário
        System.out.print("Digite um número natural para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // verifica se o número é negativo
        if (numero < 0) {
            System.out.println("Número inválido. Por favor, insira um número natural.");
        } else {
            // calcula o fatorial do número
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            // imprime o resultado
            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }
}