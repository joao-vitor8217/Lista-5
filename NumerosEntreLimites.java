import java.util.Scanner;

public class NumerosEntreLimites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita os dois números inteiros positivos
        System.out.print("Digite o primeiro número inteiro positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int numero2 = scanner.nextInt();

        // verifica se os números são positivos
        if (numero1 > 0 && numero2 > 0) {
            // troca os números se o segundo número for menor que o primeiro
            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }

            // imprime os números inteiros entre os limites informados
            System.out.println("Números inteiros entre " + numero1 + " e " + numero2 + ":");
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, digite números inteiros positivos.");
        }

        scanner.close();
    }
}