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
}
