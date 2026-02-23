package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 15; 
        int primeiro = 1, segundo = 1;

        System.out.print("Sequência de Fibonacci: ");

        System.out.print(primeiro + " ");

        System.out.print(segundo + " ");

        for (int i = 3; i <= n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println(); 
    }
}
