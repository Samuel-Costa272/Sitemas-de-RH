package comcapsrh;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Getters (sem setters)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    // Regra de negócio
    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
        } else {
            System.out.println("Percentual inválido!");
        }
    }
}