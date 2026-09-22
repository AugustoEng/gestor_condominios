package gestao_condominio;

public class Cobertura extends Unidade{
    public Cobertura(int numero, double taxaBase, boolean ocupado) {
        super(numero, taxaBase, ocupado);
    }

    @Override
    public double CalcularTaxa() {
        return super.CalcularTaxa() * 1.25;
    }
}
