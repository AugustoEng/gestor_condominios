package gestao_condominio;

public class Zelador extends Funcionario{

    Zelador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return calcularSalario() * 1.1;
    }
}
