package poojava.exercicio.exception;

public class ExceptionCustomizado {

    public static void main(String[] args) {

        int[] numerador = {1, 2, 3, 4, 5};
        int[] denominador = {1, 0, 2, 0, 3};

        for (int num : numerador) {
            for (int den : denominador) {

                int resultado = num / den;
                System.out.println("Resultado de " + num + " / " + den + " = " + resultado);
            }
        }

        for (int den : denominador) {

            int resultado = numerador[den] / den;
            System.out.println("Resultado de " + numerador[den] + " / " + den + " = " + resultado);
        }
    }
}
