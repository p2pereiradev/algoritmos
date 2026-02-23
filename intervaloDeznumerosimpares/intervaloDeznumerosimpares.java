package intervaloDeznumerosimpares;

public class intervaloDeznumerosimpares {
    public static void main(String[] args) {
        int num = 1;
        int contador = 0;

        while (num <= 10) {
            if (num % 2 == 1) {
                System.out.println("" + num);
                contador++;
        }
        num++;
    }
    System.out.println("Quantidade de números ímpares: " + contador);
    }
}
