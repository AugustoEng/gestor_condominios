package gestao_condominio;

public class App {
    public static void main(String[] args)  {
        Morador Jefferson = new Morador("Jefferson Pereira", "000.000.000-00", 12);
        System.out.println("Nome " + Jefferson.nome);
        System.out.println("CPF " + Jefferson.cpf);
        System.out.println("IDnum " + Jefferson.numeroUnidade);
    }
}