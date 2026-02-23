import java.util.Scanner;

public class areaTriangulo {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base do seu triângulo: ");
        double base = teclado.nextDouble();

        System.out.println("Digite a altura do seu triangulo: ");
        double altura = teclado.nextDouble();

        double area = base * (altura / 2);

        System.out.println("A área do seu triângulo é: " + area + "m²");

    }
}
