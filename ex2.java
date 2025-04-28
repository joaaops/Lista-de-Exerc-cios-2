import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        //Escreva um código Java que verifica se um número é par ou ímpar.

        int numero;
        System.out.println("Informe um número qualquer");
        numero = entradaDados.nextInt();

        if (numero%2==0){
            System.out.println("NúmeroPar");
        } else {
        System.out.println("NumeroImpar");
    }
    }
}
