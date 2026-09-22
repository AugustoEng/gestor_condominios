package gestao_condominio;

public class Unidade {
    private int numero;
    private double taxaBase;
    private boolean ocupado;

    public Unidade(int numero, double taxaBase, boolean ocupado)    {
        this.numero = numero;
        if  (taxaBase < 0)  {
            this.taxaBase = 0;
        } else {
            this.taxaBase = taxaBase;
        }
        this.ocupado = ocupado;
    }

    public Unidade(int numero, double taxaBase) {
        this(numero, taxaBase, true);
    }

    public int getNumero()  {
        return numero;
    }

    public double getTaxaBase() {
        return taxaBase;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public double CalcularTaxa() {
        return this.taxaBase;
    }

    public boolean ExibirSituacao()   {
        return this.ocupado;
    }
}
