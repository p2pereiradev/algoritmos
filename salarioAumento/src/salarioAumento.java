import java.util.Scanner;

public class salarioAumento {
    static void main(String[] args) {

        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o seu salário atual: ");
        double salarioAtual = salario.nextDouble();

        double salarioAumento = ((salarioAtual * 20 / 100)+ salarioAtual);

        System.out.println("O novo salário com 20% de acréscimo será: " + salarioAumento);

    }
}