package gestao_condominio;

public class Cobertura extends Unidade{
    public Cobertura(int numero, double taxaBase, boolean ocupado) {
        super(numero, taxaBase, ocupado);
    }

    @Override
    public double CalcularTaxa() {
        return super.CalcularTaxa() * 1.25;
    }

    @Override
    public String toString()    {
        return String.format("Numero: %d | Taxa: %.2f | Ocupado: %B", getNumero(), CalcularTaxa(), getOcupado());
    }
}
