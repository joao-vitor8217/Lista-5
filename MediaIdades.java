import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdades = 0;
        int quantidadeIdades = 0;

        // loop para ler idades e calcular a soma das idades
        while (true) {
            System.out.print("Digite uma idade (ou um número negativo para encerrar): ");
            int idade = scanner.nextInt();

            // verifica se o usuário deseja encerrar
            if (idade < 0) {
                break;
            }
            totalIdades += idade;
            quantidadeIdades++;
        }

        // calcula a média das idades
        double mediaIdades = (double) totalIdades / quantidadeIdades;

        // imprime o resultado
        if (quantidadeIdades > 0) {
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        scanner.close();
    }
}