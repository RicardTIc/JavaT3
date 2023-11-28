import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConversorDeMoedas {

  public static void main(String[] args) {
    // Peça ao usuário para inserir a taxa de câmbio.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira a taxa de cambio: ");
    double taxaCambio = scanner.nextDouble();

    // Peça ao usuário para inserir a quantidade em dólares.
    System.out.println("Insira a quantidade em dolares a ser convertida: ");
    double dolares = scanner.nextDouble();

    // Peça ao usuário para inserir a moeda de destino.
    System.out.println("Insira a moeda de destino: ");
    String moedaDestino = scanner.next();

    // Converta a quantidade em dólares e exiba o valor convertido.
    BigDecimal valorConvertido = new BigDecimal(dolares).multiply(new BigDecimal(taxaCambio)).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println(valorConvertido.toString() + " " + moedaDestino);
  }
}

