package comcapsrh;

public class Main {

    public static void main(String[] args) {

        // Funcionária comum
        Funcionario pam = new Funcionario("Pam Beesly", "111.111.111-11", 2000.0);

        // Gerente
        Gerente michael = new Gerente("Michael Scott", "222.222.222-22", 5000.0, 3000.0);

        // Exibindo dados
        System.out.println("=== FUNCIONÁRIA ===");
        System.out.println("Nome: " + pam.getNome());
        System.out.println("CPF: " + pam.getCpf());
        System.out.println("Salário: " + pam.getSalario());

        System.out.println("\n=== GERENTE ===");
        System.out.println("Nome: " + michael.getNome());
        System.out.println("CPF: " + michael.getCpf());
        System.out.println("Salário: " + michael.getSalario());
        System.out.println("Remuneração Total: " + michael.calcularRemuneracaoTotal());

        // Aplicando aumento
        System.out.println("\nAplicando aumento de 10% na Pam...");
        pam.aplicarAumento(10);

        System.out.println("Novo salário da Pam: " + pam.getSalario());
    }
}