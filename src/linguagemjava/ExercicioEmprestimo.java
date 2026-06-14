public class ExercicioEmprestimo {

    public static void main(String[] args) {

        double valorEmprestimo = 1000.0; // Valor do empréstimo
        double numeroParcelas = 3; // Número de parcelas (2 ou 3)

        calcular(valorEmprestimo, numeroParcelas);
    }

    public static void calcular (double valor, double parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * 0.10);
            System.out.println("Valor final do empréstimo: " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * 0.15);
            System.out.println("Valor final do empréstimo: " + valorFinal);
        } else {
            System.out.println("Número de parcelas inválido. O empréstimo deve ser pago em 2 ou 3 parcelas.");
        }
    }
}