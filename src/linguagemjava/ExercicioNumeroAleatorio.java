
import java.util.Random;

public class ExercicioNumeroAleatorio {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numeroAleatorio = new int[20];
        for (int i = 0; i < numeroAleatorio.length; i++) {
            numeroAleatorio[i] = random.nextInt(100);
        }
        System.out.println("Números aleatórios gerados: " + java.util.Arrays.toString(numeroAleatorio));

        System.out.println("Números sucessores e antecessores: ");

        for (int numero : numeroAleatorio) {
            System.out.println("Antecessor: " + (numero - 1));
            System.out.println("Número: " + numero);
            System.out.println("Sucessor: " + (numero + 1));
        }
    }
}
