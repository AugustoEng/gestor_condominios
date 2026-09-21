package gestao_condominio;
import java.util.Scanner;

public class App {

    static String nome;
    static int blocos;
    static int unidades;
    static double taxa;
    static boolean portaria;

    static public void Simular(int unidades, double taxa) {
        double total = 0;
        int num = 1;
        for (int i = 0; i < unidades; i++) {
            System.out.println("Unidade " + num + " - Taxa: " + taxa);
            total += taxa;
            num ++;
        }
        System.out.printf("Total: %.2f%n", total);
    }

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
        System.out.print("Taxa padrão: " + taxa);
        if  (taxa <= 400)   {
            System.out.print(" - Taxa Econômica\n");
        } else if (taxa > 400 && taxa <= 700) {
            System.out.print(" - Taxa intermediária\n");
        } else {
            System.out.print(" - Taxa Elevada\n");
        }
        System.out.println("Portaria 24H: " + portaria + "\n\n\n");

        Simular(unidades, taxa);

        scanner.close();
    }

}
