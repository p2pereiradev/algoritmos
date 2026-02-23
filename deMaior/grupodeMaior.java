package deMaior;

import java.util.Scanner;

public class grupodeMaior {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o número de pessoas (n):");
        int n = teclado.nextInt();

        int contadorMaior = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = teclado.nextInt();

            if (idade >= 18) {
                contadorMaior++;
            }
        }
        System.out.println("Quantidade de pessoas maiores de idade é: " + contadorMaior);
    }
}
