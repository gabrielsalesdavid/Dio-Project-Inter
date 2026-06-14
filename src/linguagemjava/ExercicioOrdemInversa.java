
public class ExercicioOrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println(vetor.length);

        int count = 0;

        System.out.println("Vetor com o While(Enquanto) em ordem normal: ");
        while (count < (vetor.length)) {

            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println();

        System.out.println("Vetor com o For(Para) em ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
