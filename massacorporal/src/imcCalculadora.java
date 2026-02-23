import java.util.Scanner;

public class imcCalculadora {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu peso em kg: ");
        double peso = teclado.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu IMC é de: " + imc);

        if (imc < 18.5){
            System.out.print("Magreza: " + imc);
        } else if (imc < 24.9){
            System.out.println("Normal");
        } else if (imc < 29.9){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
