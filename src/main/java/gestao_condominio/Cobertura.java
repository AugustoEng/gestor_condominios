package gestao_condominio;

public class Cobertura extends Unidade{
    public Cobertura(int numero, double taxaBase) {
        super(numero, taxaBase);
    }

    @Override
    public double CalcularTaxa() {
        return super.CalcularTaxa() * 1.25;
    }

    @Override
    public String toString()    {
        return String.format("Numero: %d | Taxa: %.2f | Ocupado: %s", getNumero(), CalcularTaxa(), getOcupado() ? "Sim" : "Não");
    }
}
