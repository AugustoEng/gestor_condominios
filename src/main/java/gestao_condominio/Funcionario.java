package gestao_condominio;

public class Funcionario {
    private String nome;
    protected double salarioBase;

    Funcionario(String nome, double salarioBase)    {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public double calcularSalario() {
        return this.salarioBase;
    }
}
