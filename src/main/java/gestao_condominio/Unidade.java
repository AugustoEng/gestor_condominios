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

    public int getNumero()  {
        return numero;
    }

    public double getTaxaBase() {
        return taxaBase;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void CalcularTaxa() {
        System.out.print("Taxa:" + this.taxaBase + "\n");
    }

    void ExibirSituacao()   {
        System.out.print("Situacao: ");
        if(this.ocupado)    {
            System.out.print("Ocupado\n");
        } else  {
            System.out.print("Livre\n");
        }
    }
}
