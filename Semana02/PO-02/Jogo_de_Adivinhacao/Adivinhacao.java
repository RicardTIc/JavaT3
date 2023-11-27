import java.util.Random;

public class Adivinhacao {

    public static void main(String[] args) {
        // Gera um número aleatório entre 1 e 100
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(100) + 1;

        // Inicializa o número de tentativas
        int tentativas = 0;

        // Loop principal do jogo
        while (true) {
            // Solicita ao usuário que adivinhe o número
            System.out.println("Digite um numero entre 1 e 100: ");
            int chute = Integer.parseInt(System.console().readLine());

            // Aumenta o número de tentativas
            tentativas++;

            // Verifica se o usuário acertou
            if (chute == numeroSecreto) {
                System.out.println("Parabens! Voce acertou em " + tentativas + " tentativas.");
                break;
            } else if (chute < numeroSecreto) {
                System.out.println("O numero secreto e maior.");
            } else {
                System.out.println("O numero secreto e menor.");
            }
        }
    }
}

    

