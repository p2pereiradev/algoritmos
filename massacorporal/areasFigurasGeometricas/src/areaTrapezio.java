import java.util.Scanner;

public class areaTrapezio {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a maior base: ");
        double baseMaior = teclado.nextDouble();

        System.out.println("Digite a menor base");
        double baseMenor = teclado.nextDouble();

        System.out.println("Digite a altura");
        double altura = teclado.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do seu trapézio é de: " + area + "cm²");
    }
}
