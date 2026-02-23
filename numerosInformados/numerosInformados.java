package numerosInformados;

import java.util.Scanner;

public class numerosInformados {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite quantos valores você deseja informar: ");
        int n = teclado.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o número " + i + ":");
            int numerosInf = teclado.nextInt();
            sum += numerosInf;

    
        }
        System.out.println("A soma dos números informados é: " + sum);
    }
}
