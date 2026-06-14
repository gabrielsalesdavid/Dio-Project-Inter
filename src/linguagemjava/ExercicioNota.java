import java.util.Scanner;

public class ExercicioNota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente: ");
            nota = sc.nextDouble();
        }
        System.out.println("Nota válida: " + nota);

        sc.close();
    }
}   