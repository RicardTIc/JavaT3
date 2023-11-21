import java.util.Scanner;

public class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius* 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double resultado = celsiusParaFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + resultado + " °F");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double resultado = fahrenheitParaCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + resultado + " °C");
        } else {
            System.out.println("Escolha inválida. Por favor, digite 1 ou 2.");
        }

        scanner.close();
    }
}
