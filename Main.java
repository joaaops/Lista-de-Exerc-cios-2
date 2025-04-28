import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        //9. Escreva um código Java que verifica se um usuário é maior de idade.

        System.out.printf("Digite sua idade: ");
        int idade = entradaDados.nextInt();

        if (idade >=18){
            System.out.printf("Você é maior de idade");
        }else
            System.out.printf("Você é menor de idade");
    }
}