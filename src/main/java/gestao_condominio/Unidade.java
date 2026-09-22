package gestao_condominio;

public class Unidade {
    int numero;
    double taxaBase;
    boolean ocupado;

    public Unidade(int numero, double taxaBase, boolean ocupado)    {
        this.numero = numero;
        this.taxaBase = taxaBase;
        this.ocupado = ocupado;
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
