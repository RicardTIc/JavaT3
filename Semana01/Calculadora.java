import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Cria um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números
        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário que escolha uma operação
        System.out.println("Escolha uma operacao:");
        System.out.println("1. Adicao");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");

        System.out.print("Digite o numero da operacao desejada: ");
        int escolha = scanner.nextInt();

        // Calcula o resultado com base na escolha do usuário
        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                // Verifica se o segundo número é diferente de zero antes de realizar a divisão
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisao por zero!");
                    // Encerra o programa
                    return;
                }
                break;
            default:
                System.out.println("Opca2o inválida!");
                // Encerra o programa
                return;
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);

        // Fecha o Scanner
        scanner.close();
    }
}
