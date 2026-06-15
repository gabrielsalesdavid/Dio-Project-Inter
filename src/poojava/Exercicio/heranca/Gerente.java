package poojava.exercicio.heranca;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salarioBase, String departamento) {
        super(nome, salarioBase);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 1000; // Gerente recebe um bônus fixo
    }
    
}
