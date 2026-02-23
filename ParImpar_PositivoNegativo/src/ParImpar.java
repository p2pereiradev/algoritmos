import java.util.Scanner;

public class ParImpar {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numeroDigitado;
        numeroDigitado = teclado.nextInt();

        System.out.println("O valor digitado foi: " + numeroDigitado);

        if (numeroDigitado % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }



    }
}
