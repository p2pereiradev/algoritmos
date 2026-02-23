import java.util.Scanner;

public class mediaAluno {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;
        System.out.println("Nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = teclado.nextDouble();

        System.out.println("Nota 4: ");
        nota4 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4 ;

        System.out.println("=====RESULTADO=====");

        if (media < 7) {
            System.out.println("Recuperação: " + media);
        } else {
            System.out.println("Parabéns, você foi aprovado! " + media);
        }


    }
}