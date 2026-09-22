package gestao_condominio;

public class App {
    public static void main(String[] args)  {
        Unidade Unidade101 = new Unidade(101, 200, true);
        Unidade Unidade102 = new Unidade(102,20, true);
        Unidade Unidade201 = new Unidade(201, 200, false);

        System.out.print("unidade " + Unidade101.numero + "\nTaxa Base: " + Unidade101.taxaBase + "\n");
        if(Unidade101.ocupado)  {
            System.out.println("Ocupado\n\n");
        } else  {
            System.out.println("Livre\n\n");
        }

        System.out.print("unidade " + Unidade102.numero + "\nTaxa Base: " + Unidade102.taxaBase + "\n");
        if(Unidade102.ocupado)  {
            System.out.println("Ocupado\n\n");
        } else  {
            System.out.println("Livre\n\n");
        }

        System.out.print("unidade " + Unidade201.numero + "\nTaxa Base: " + Unidade201.taxaBase + "\n");
        if(Unidade201.ocupado)  {
            System.out.println("Ocupado\n\n");
        } else  {
            System.out.println("Livre\n\n");
        }
    }
}


