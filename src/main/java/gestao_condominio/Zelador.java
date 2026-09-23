package gestao_condominio;

public class Zelador extends Funcionario{

    Zelador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return calcularSalario() * 1.1;
    }

    @Override
    public String toString()    {
        return String.format("Nome: %s | Salário: %.2f", getNome(), calcularSalario());
    }
}
