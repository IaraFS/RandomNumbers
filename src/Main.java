import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner numeroDigitado = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número de 0 a 100: ");
            int numedoDigitado = numeroDigitado.nextInt();
            tentativas ++;

        if (numedoDigitado == numeroGerado){
            System.out.println("Você acertou o número em " +tentativas + "tentativas");
            break;   }

        else if (numedoDigitado < numeroGerado) {
            System.out.println("O número digitado é menor que o número gerado");
        }
        else {
                System.out.println("O número digitado é maior que o número gerado");
            }
        }

        if (tentativas == 5){
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era: " + numeroGerado);
        }









    }
}