package gestao_condominio;

public class Cobertura extends Unidade{
    public Cobertura(int numero, double taxaBase, boolean ocupado) {
        super(numero, (taxaBase * 1.2), ocupado);
    }

    public void getAll()  {
        int numero = this.getNumero();
        double taxa = this.CalcularTaxa();
        System.out.print("Numnero: " + numero + "\nTaxa: " + taxa);
    }
}
