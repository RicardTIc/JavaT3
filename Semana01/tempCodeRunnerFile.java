public class ConversorDeTemperatura {

    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura e a unidade de origem
        System.out.println("Digite a temperatura que deseja converter:");
        double temperatura = sc.nextDouble();
        System.out.println("Digite a unidade de origem (C para Celsius ou F para Fahrenheit):");
        char unidade = sc.next().charAt(0);

        // Declarar uma variável para armazenar a temperatura convertida
        double temperaturaConvertida;

        // Verificar a unidade de origem e realizar a conversão
        if (unidade == 'C' || unidade == 'c') {
            // A unidade de origem é Celsius, então converter para Fahrenheit
            temperaturaConvertida = (temperatura * 9 / 5) + 32;
            // Exibir o resultado
            System.out.println(temperatura + " graus Celsius equivalem a " + temperaturaConvertida + " graus Fahrenheit.");
        } else if (unidade == 'F' || unidade == 'f') {
            // A unidade de origem é Fahrenheit, então converter para Celsius
            temperaturaConvertida = (temperatura - 32) * 5 / 9;
            // Exibir o resultado
            System.out.println(temperatura + " graus Fahrenheit equivalem a " + temperaturaConvertida + " graus Celsius.");
        } else {
            // A unidade de origem é inválida, então exibir uma mensagem de erro
            System.out.println("Unidade de origem inválida. Por favor, digite C ou F.");
        }

        // Fechar o objeto Scanner
        sc.close();
    }
}
