import java.util.Scanner;

public class ContagemMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contMulheresEntre20e40 = 0;

        // loop para ler a idade e o sexo de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa #" + i);
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            // verifica se a pessoa é do sexo feminino e tem entre 20 e 40 anos
            if (idade >= 20 && idade <= 40) {
                System.out.print("Digite o sexo (M/F): ");
                char sexo = scanner.next().charAt(0);

                if (sexo == 'F' || sexo == 'f') {
                    contMulheresEntre20e40++;
                }
            }
        }

        // imprime o resultado
        System.out.println("Número de mulheres entre 20 e 40 anos: " + contMulheresEntre20e40);

        scanner.close();
    }
}





