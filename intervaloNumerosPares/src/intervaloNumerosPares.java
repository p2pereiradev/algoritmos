public class intervaloNumerosPares {
    public static void main(String[] args) {

        int num = 1;
        int contador = 0;

        while (num <= 50) {
            if (num % 2 == 0) {
                System.out.println(num);
                contador++;
            }
            num++;
        }

        System.out.println("Quantidade de números pares: " + contador);
    }
}