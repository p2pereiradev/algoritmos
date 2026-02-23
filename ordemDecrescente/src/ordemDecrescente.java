import java.util.*;

public class ordemDecrescente {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3;

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        List<Integer>numeros = new ArrayList<>(List.of(n1,n2,n3));

        numeros.stream().sorted(Comparator.reverseOrder()).forEach
                (System.out::println);

    }
}
