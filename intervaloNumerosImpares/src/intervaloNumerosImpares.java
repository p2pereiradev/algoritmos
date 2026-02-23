public class intervaloNumerosImpares {
    public static void main(String[] args) {

        int num = 50;
        int contador = 0;

        while (num <= 150) {
            if (num % 2 == 1) {
                System.out.println(num);
                contador++;
            }
            num++;
        }

        System.out.println("Quantidade de números impares: " + contador);
    }
}