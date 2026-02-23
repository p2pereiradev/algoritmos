import java.util.Scanner;

public class areaCirculo {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio do seu círculo: ");
        double raio = teclado.nextDouble();

        double pi = Math.PI;

        double area = pi * (raio * raio);

        System.out.println("A área do círculo é de: " + area);


    }
}
