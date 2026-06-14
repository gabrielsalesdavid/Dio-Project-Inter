
import java.util.Scanner;

public class ExercicioNomeIdade {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        int idade;

        while (true) {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            if (!nome.trim().isEmpty()) {
                break;
            }

            System.out.println("O nome não pode ser vazio. Por favor, tente novamente.");
        }
        while (true) {
            System.out.println("Digite sua idade: ");
            if (sc.hasNextInt()) {
                idade = sc.nextInt();
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para a idade.");
                sc.next(); // Limpa a entrada inválida
            }
        }
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        sc.close();
    }
}
