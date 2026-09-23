package gestao_condominio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        AuxilioUI UI = new AuxilioUI();
        int resposta;

        Condominio Garden = new Condominio("Java Garden", 0);
        Unidade unidade101 = new Unidade(101, 500);
        Unidade unidade102 = new Unidade(102, 500);
        Cobertura cobertura201 = new Cobertura(201, 500);
        Morador morador101 = new Morador("Carlos", "11111111111", 101);
        Funcionario funcionario = new Funcionario("Paulo", 2500);
        Zelador zelador = new Zelador("Marcos", 3000);


        System.out.print("===========================\n" +
                " RESIDENCIAL JAVA GARDEN\n" +
                "=====================================\n\n");

        do {
            UI.Sleep(2000);
            System.out.print("1 - Consultar condomínio\n" +
                    "2 - Consultar unidade\n" +
                    "3 - Consultar morador\n" +
                    "4 - Calcular taxa de unidade\n" +
                    "5 - Calcular taxa com multa\n" +
                    "6 - Registrar pagamento\n" +
                    "7 - Registrar despesa\n" +
                    "8 - Consultar funcionário\n" +
                    "9 - Simular arrecadação\n" +
                    "0 - Sair\n");
            resposta = scanner.nextInt();

            switch (resposta)   {
                case 1 ->   {
                    System.out.println(Garden);
                    UI.confirmar();
                    UI.linha(20);
                }

                case 2 ->   {
                    System.out.println("Padrões:");
                    System.out.println(unidade101);
                    System.out.println(unidade102);
                    System.out.println();
                    System.out.println("Coberturas:");
                    System.out.println(cobertura201);
                    UI.confirmar();
                    UI.linha(20);
                }

                case 3 ->   {
                    System.out.println("Moradores:");
                    System.out.println(morador101);
                    UI.confirmar();
                    UI.linha(20);
                }

                case 4 ->   {
                    System.out.println("Taxa da Unidade:");
                    System.out.printf(
                            "Unidade %d possui a taxa de %.2f\n", unidade101.getNumero(), unidade101.CalcularTaxa());
                    System.out.printf(
                            "Unidade %d possui a taxa de %.2f\n", unidade102.getNumero(), unidade102.CalcularTaxa());
                    System.out.printf(
                            "Unidade %d possui a taxa de %.2f\n", cobertura201.getNumero(), cobertura201.CalcularTaxa());
                    UI.confirmar();
                    UI.linha(20);
                }

                case 5 ->   {
                    int pitaco;
                    int juros;
                    System.out.print("Unidades para serem taxadas:\n");
                    System.out.print("1 101\n");
                    System.out.print("2 102\n");
                    System.out.print("3 201\n");
                    pitaco = scanner.nextInt();
                    System.out.print("Em quantos $? ");
                    juros = scanner.nextInt();

                    switch (pitaco) {
                        case 1 -> System.out.printf(
                                "Unidade 101 pagará %.2f com %d por cento de juros\n", unidade101.CalcularTaxa((double) juros), juros);
                        case 2 -> System.out.printf(
                                "Unidade 101 pagará %.2f com %d por cento de juros\n", unidade102.CalcularTaxa((double) juros), juros);
                        case 3 -> System.out.printf(
                                "Unidade 101 pagará %.2f com %d por cento de juros\n", cobertura201.CalcularTaxa((double) juros), juros);
                    }
                    UI.confirmar();
                    UI.linha(20);

                }

                case 6 -> {
                    int pitaco;
                    double pagamento;
                    System.out.print("Unidades para pagamento:\n");
                    System.out.print("1 101\n");
                    System.out.print("2 102\n");
                    System.out.print("3 201\n");
                    pitaco = scanner.nextInt();

                    switch (pitaco) {
                        case 1 -> {
                            pagamento = unidade101.CalcularTaxa();
                            Garden.ReceberPagamento(pagamento);
                            System.out.printf("Unidade 101 pagou R$ %.2f\n", pagamento);
                        }
                        case 2 -> {
                            pagamento = unidade102.CalcularTaxa();
                            Garden.ReceberPagamento(pagamento);
                            System.out.printf("Unidade 101 pagou R$ %.2f\n", pagamento);
                        }
                        case 3 -> {
                            pagamento = cobertura201.CalcularTaxa();
                            Garden.ReceberPagamento(pagamento);
                            System.out.printf("Unidade 101 pagou R$ %.2f\n", pagamento);
                        }

                    }
                    UI.confirmar();
                    UI.linha(20);
                }

                case 7 -> {
                    double despesa;
                    System.out.print("De quanto é a despesa? ");
                    despesa = scanner.nextDouble();
                    Garden.PagarDespesa(despesa);
                    System.out.print("\nSaldo atual: " + Garden.getSaldoCaixa() + "\n");
                    UI.confirmar();
                    UI.linha(20);
                }

                case 8 ->   {
                    System.out.print("Funcionários:\n");
                    System.out.println(funcionario);
                    System.out.println(zelador);
                    UI.confirmar();
                    UI.linha(20);
                }

                case  9 ->  {
                    double total = unidade101.CalcularTaxa() + unidade102.CalcularTaxa() + cobertura201.CalcularTaxa();
                    System.out.println("Padrões:");
                    System.out.println(unidade101);
                    System.out.println(unidade102);
                    System.out.println();
                    System.out.println("Coberturas:");
                    System.out.println(cobertura201);
                    System.out.println("Arrecadação total: " + total);
                    UI.confirmar();
                    UI.linha(20);
                }

                case 0 -> {
                    scanner.close();
                    System.out.println("Obrigado por Utilizar nosso sistema");
                    break;
                }
            }

        } while (true);


    }
}


