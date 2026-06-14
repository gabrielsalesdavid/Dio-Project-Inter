
import java.util.Scanner;

public class ExercicioTabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        System.out.println("Digite o de operador aritmético:");
        char operador = sc.next().charAt(0);

        System.out.println();
        System.out.println("Tabuada de " + numero + " com o operador '" + operador + "':");

        switch (operador) {
            case '*':
                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;
            case '+':
                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                break;
            case '-':
                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }
                break;
            case '/':
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " / " + i + " = " + (numero / i));
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        sc.close();
    }
}
