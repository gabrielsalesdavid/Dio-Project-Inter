package poojava.Exercicio.heranca;

public class Faxineiro extends Funcionario {
    private String turno;

    public Faxineiro(String nome, double salarioBase, String turno) {
        super(nome, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario(); // Faxineiro recebe apenas o salário base
    }
    
}
