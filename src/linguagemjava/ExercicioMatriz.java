import java.util.Random;

public class ExercicioMatriz {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz de " + matriz.length + "x" + matriz.length + ": ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}