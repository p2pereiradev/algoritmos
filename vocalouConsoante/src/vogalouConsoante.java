import java.util.Scanner;

public class vogalouConsoante {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra;

        letra = scanner.next();

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {

            System.out.println("É vogal: " + letra);
        } else {
            System.out.println("É consoante: " + letra);
        }

    }
}