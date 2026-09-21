package gestao_condominio;
import java.util.Scanner;

public class App {

    static String nome;
    static int blocos;
    static int unidades;
    static double taxa;
    static boolean portaria;

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o Nome: ");
        nome = scanner.nextLine();
        System.out.print("Insira os Blocos: ");
        blocos = scanner.nextInt();
        System.out.print("Insira as Unidades: ");
        unidades = scanner.nextInt();
        System.out.print("Insira a Taxa: ");
        taxa = scanner.nextDouble();
        System.out.print("Portaria 24H?\n[1] Sim\n[2] Não\n");
        if  (scanner.nextInt() == 1)    {
            portaria = true;
        } else  {
            portaria = false;
        }



        System.out.println("Nome: " + nome);
        System.out.println("Blocos: " + blocos);
        System.out.println("Unidades: " + unidades);
        System.out.println("Taxa padrão: " + taxa);
        System.out.println("Portaria 24H: " + portaria);

        scanner.close();
    }

}
