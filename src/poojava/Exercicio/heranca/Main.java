package poojava.exercicio.heranca;

import poojava.exercicio.heranca.Funcionario;
import poojava.exercicio.heranca.Gerente;
import poojava.exercicio.heranca.Vendedor;
import poojava.exercicio.heranca.Faxineiro;

public class Main {
    
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Alice", 5000, "Vendas");
        Funcionario vendedor = new Vendedor("Bob", 3000, 500);
        Funcionario faxineiro = new Faxineiro ("Charlie", 2000, "Noite");

        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.calcularSalario());
        System.out.println("Vendedor: " + vendedor.getNome() + ", Salário: " + vendedor.calcularSalario());
        System.out.println("Faxineiro: " + faxineiro.getNome() + ", Salário: " + faxineiro.calcularSalario());
    }
}