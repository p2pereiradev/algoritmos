import java.util.Scanner;

public class areaQuadrado {

    public class Main {
        static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite a area do seu quadrado: ");
            double area = teclado.nextDouble();

            System.out.println("Digite a lado do seu quadrado: ");
            double lado = teclado.nextDouble();

            double quadrado = area = (lado * lado);

            System.out.println("A área do quadrado é: " + quadrado);

        }
    }
}
