import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        //Escreva um código Java que lê a nota de um aluno e verifica se ele foi aprovado ou reprovado.
x

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota");
        int nota3 = scanner.nextInt();

        if (nota1 + nota2 + nota3 > 80) {
        System.out.println("Você fpo aprovado");

    } else {
            System.out.println("Você foi reprovado");
        }
    }
}
