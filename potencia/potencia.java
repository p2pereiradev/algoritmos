package potencia;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base:");
        int base = teclado.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = teclado.nextInt();

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
           resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}
