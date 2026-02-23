import java.util.Scanner;

public class novoExame {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double n1, n2, n3, n4;
        System.out.println("Digite a sua primeira nota: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite a sua nota 2");
        n2 = teclado.nextDouble();

        System.out.println("Digite a sua nota 3");
        n3 = teclado.nextDouble();

        System.out.println("Digite a sua nota 4");
        n4 = teclado.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média do aluno é igual: " + media);

        if (media >= 7) {
            System.out.println("APROVADO!" + media);
        } else {
            System.out.println("REPROVADO! NECESSÁRIO UM NOVO EXAME: " + media);
        }
        System.out.println("==============================================");
        double notaExame;

        System.out.println("Digite a nota do exame");
        notaExame = teclado.nextDouble();

        double novaMedia = (media + notaExame) / 2;

        System.out.println("A sua nova nota: " + novaMedia);

        if (novaMedia < 5) {
            System.out.println("Você não foi aprovado! " + novaMedia);
        } else {
            System.out.println("Parabéns! Você foi aprovado. " + novaMedia);
        }

    }
}
