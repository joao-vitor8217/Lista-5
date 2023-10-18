import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita um número ao usuário
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // calcula e imprime a tabuada de multiplicação
        System.out.println("Tabuada de multiplicação de " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}