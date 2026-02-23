import java.util.Scanner;

public class maiorMenorIntermediario {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Digite um número: ");
        n1 = teclado.nextInt();

        System.out.println("Digite outro número: ");
        n2 = teclado.nextInt();

        System.out.println("Digite mais um número: ");
        n3 = teclado.nextInt();

        if (n1 > n2 | n1 > n3){
            System.out.println("Este é o maior de todos: " + n1);
        } else if (n1 < n2 | n1 > n3){
            System.out.println("Este é o intermediário" + n1);
        } else {
            System.out.println("Este é o menor" + n1);
        }

        if (n2 > n1 | n2>n3){
            System.out.println("Este é o maior de todos" + n2);
        } else if (n2 < n1 | n2 > n3){
            System.out.println("Este é o intermediário" + n2);
        } else {
            System.out.println("Este é o menor de todos" + n2);
        }

        if (n3 > n1 | n3 > n2){
            System.out.println("Este é o maior de todos" + n3);
        } else if (n3 < n1 | n3 > n2){
            System.out.println("Este é o intermediário" + n3);
        } else {
            System.out.println("Este é o menor" + n3);
        }

    }
}