import java.util.Scanner;

public class ContagemPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contHomensEntre60e80 = 0;
        int contMulheresEntre50e70 = 0;

        // loop para ler o sexo e o peso de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa #" + i);
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            // verifica a condição para homens e mulheres e incrementa os contadores
            if (sexo == 'M' || sexo == 'm') {
                if (peso >= 60 && peso <= 80) {
                    contHomensEntre60e80++;
                }
            } else if (sexo == 'F' || sexo == 'f') {
                if (peso >= 50 && peso <= 70) {
                    contMulheresEntre50e70++;
                }
            }
        }

        // imprime os resultados
        System.out.println("Número de homens com peso entre 60 e 80 kg: " + contHomensEntre60e80);
        System.out.println("Número de mulheres com peso entre 50 e 70 kg: " + contMulheresEntre50e70);

        scanner.close();
    }
}