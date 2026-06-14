
import java.util.Scanner;

public class ExercicioParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int count = 0;

        int qtdPares = 0, qtdImpares = 0;

        do {

            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            count++;

            if(numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
                qtdPares++;
            } else {
                System.out.println("O número " + numero + " é ímpar.");
                qtdImpares++;
            }

        } while (count < 5);

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);

        sc.close();
    }
}
