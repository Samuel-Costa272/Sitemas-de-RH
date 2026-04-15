package comcapsrh;

public class Gerente extends Funcionario {

    private double bonusAnual;

    // Construtor
    public Gerente(String nome, String cpf, double salario, double bonusAnual) {
        super(nome, cpf, salario);
        this.bonusAnual = bonusAnual;
    }

    // Getter e Setter do bônus
    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    // Regra de negócio
    public double calcularRemuneracaoTotal() {
        return getSalario() + bonusAnual;
    }
}