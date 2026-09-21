package gestao_condominio;

public class App {

    static String nome = "Luz Azul";
    static int blocos = 4;
    static int unidades = 22;
    static double taxa = 200.50;
    static boolean portaria = true;

    public static void main(String[] args)  {
        System.out.println("Nome: " + nome);
        System.out.println("Blocos: " + blocos);
        System.out.println("Unidades: " + unidades);
        System.out.println("Taxa padrão: " + taxa);
        System.out.println("Portaria 24H: " + portaria);
    }

}
