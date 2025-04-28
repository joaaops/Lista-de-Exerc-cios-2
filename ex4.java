import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        // Escreva um código Java que calcula o desconto de um produto com base em seu valor original.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor original do produto: R$ ");
        double valorOriginal = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorOriginal * (percentualDesconto / 100);
        double valorFinal = valorOriginal - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final do produto: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
