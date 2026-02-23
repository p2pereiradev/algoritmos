import java.util.Scanner;

public class calculoSoma{
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n = 1;
        int count = 0;

       while(n <= 5) {
            count += n;
            n++;
       }
       System.out.println("Resultado da soma é: " + count);
    }
}