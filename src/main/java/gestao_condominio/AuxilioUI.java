package gestao_condominio;
import java.util.Scanner;

public class AuxilioUI {

    public AuxilioUI(){

    }

    public void Sleep(int tempo) throws InterruptedException {
        if  (tempo >= 2000)    {
            System.out.print("\n");
            int fatia = tempo / 5;
            for(int i = 0; i < 5; i++)  {
                System.out.print(".");
                Thread.sleep(fatia);
            }
            System.out.print("\n");
        } else  {
            Thread.sleep(tempo);
        }
    }

    public void confirmar() {
        System.out.println("Dê enter para Continuar....");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void linha(int num)  {
        for (int i = 0; i < num; i++)   {
            System.out.print("-");
        }
        System.out.print("\n");

    }
}
