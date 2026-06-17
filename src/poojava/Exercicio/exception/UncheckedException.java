package poojava.exercicio.exception;

import javax.swing.JOptionPane;

public class UncheckedException {

    public static void main(String[] args) {

        try {

        System.out.println("Exemplo de unchecked exception: ");
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[3]);

        System.out.println("Exemplo de divisão por zero: ");
        int resultado = dividir(10, 0);
        System.out.println(resultado);

        //JOptionPane:
        String input = JOptionPane.showInputDialog("Digite um número: ");
        JOptionPane.showMessageDialog(null, "Você digitou: " + input);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Erro: Índice fora dos limites do array. " + e.getMessage());
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero. " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}