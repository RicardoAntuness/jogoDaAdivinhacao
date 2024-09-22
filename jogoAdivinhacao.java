import java.util.Scanner;
import java.util.Random;

public class jogoAdivinhacao {
    public static void main(String[] args) {

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;

        int tentativasMax = 5;
        int tentativas = 0;
        boolean acertou = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao jogo de adivinhação e boa sorte!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar qual é o número!");

        while (tentativas < tentativasMax) {
            System.out.print("Tentativa " + (tentativas + 1) + " : ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                acertou = true;
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite);
            } else {
                System.out.println("O número é maior que " + palpite);
            }
        }

        if (!acertou) {
            System.out.println("Que pena, você não conseguiu adivinhar o número.... O número era: " + numeroAleatorio);
            
            
        }
    }
}
