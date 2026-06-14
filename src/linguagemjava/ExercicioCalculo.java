public class ExercicioCalculo {

    public static void main(String[] args) {
        soma(10, 5);
        subtracao(10, 5);
        multiplicacao(10, 5);
        divisao(10, 5);
        divisao(10, 0);
    }
    
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }

    public static void subtracao(int a, int b) {
        int resultado = a - b;
        System.out.println("A subtração de " + a + " e " + b + " é: " + resultado);
    }

    public static void multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println("A multiplicação de " + a + " e " + b + " é: " + resultado);
    }

    public static void divisao(double a, double b) {
        if (b != 0) {
            double resultado = a / b;
            System.out.println("A divisão de " + a + " por " + b + " é: " + resultado);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}
