import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        // Escreva um código Java que simula o jogo de pedra, papel e tesoura.


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Jogo JoKenPo");
        System.out.println("Escolha 0 para Pedra, 1 para Papel. 2 para Tesoura");

        System.out.printf("Sua escolha: ");
        int EsolhaUsuario = scanner.nextInt();

        if (EsolhaUsuario <0 || EsolhaUsuario >2){
        System.out.printf("Tente Novamento!");
        } else {
            int EscolhaComputador = random.nextInt(3);

            System.out.println("Você escolheu: " + opcoes[EsolhaUsuario]);
            System.out.println("O computador escolheu " + opcoes[EscolhaComputador]);

            if (EsolhaUsuario == EscolhaComputador){
                System.out.println("Empate");

            }else if (EsolhaUsuario == 0 && EscolhaComputador == 2
                    || EsolhaUsuario == 1 && EscolhaComputador == 0
                    || EsolhaUsuario == 2 && EscolhaComputador == 1){
                System.out.println("Você venceu");

            } else {
                System.out.println("O computador venceu");
            }
            scanner.close();

        }

    }
}
