import java.util.Scanner;

public class saudacoesAutomatizada {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite M para matutino, V para vespertino ou digite N para noturno: ");

        String dia;
        dia = teclado.next();

        if (dia.equalsIgnoreCase("M")) {
            System.out.println("Bom dia! ");
        } else if (dia.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde! ");
        } else if (dia.equalsIgnoreCase("N")){
            System.out.println("Boa noite! ");
        } else {
            System.out.println("Comando inválido! ");
        }

    }
}