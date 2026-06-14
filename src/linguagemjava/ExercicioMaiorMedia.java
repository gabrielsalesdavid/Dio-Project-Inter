
import java.util.Scanner;

public class ExercicioMaiorMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        int maior = 0;

        int count = 0;

        int soma = 0;

        do {

            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;

            count++;

        } while (count < 5);

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A soma dos números digitados foi: " + soma);
    }
}