import java.util.Scanner;

public class PositivoNegativo {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int positivoNegativo;
        positivoNegativo = teclado.nextInt();

        System.out.println("O número digitado é: " + positivoNegativo);

        if (positivoNegativo < 0) {
            System.out.println("É negativo");
        } else if (positivoNegativo == 0) {
            System.out.println("É neutro");
        }else
            System.out.println("É positivo");

    }
}
