package deMaior;

import java.util.Scanner;

public class deMaior {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade:");

        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Você é de maior: " + idade);
        } else {
            System.out.println("Você é de menor: " + idade);
        }
    }
}