package gestao_condominio;

public class App {
    public static void main(String[] args)  {
        Unidade Unidade101 = new Unidade(101, 200, true);
        Unidade Unidade102 = new Unidade(102,20, true);
        Unidade Unidade201 = new Unidade(201, 200, false);

//        System.out.print("Unidade 101\n");
//        Unidade101.CalcularTaxa();
//        Unidade101.ExibirSituacao();
//        System.out.print("\n\n");
//
//        System.out.print("Unidade 102\n");
//        Unidade102.CalcularTaxa();
//        Unidade102.ExibirSituacao();
//        System.out.print("\n\n");
//
//        System.out.print("Unidade 201\n");
//        Unidade201.CalcularTaxa();
//        Unidade201.ExibirSituacao();
//        System.out.print("\n\n");

    Condominio VentoAzul = new Condominio("Vento Azul", 3000);

    VentoAzul.PagarDespesa(20000);
    VentoAzul.ReceberPagamento(300);
    }
}


