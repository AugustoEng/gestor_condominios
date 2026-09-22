package gestao_condominio;

public class Condominio {
    private String nome;
    private double saldoCaixa;

    public Condominio(String nome, double saldoCaixa)   {
        this.nome = nome;
        if  (saldoCaixa < 0)    {
            this.saldoCaixa = 0;
        } else  {
            this.saldoCaixa = this.saldoCaixa;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSaldoCaixa()   {
        return saldoCaixa;
    }

    public void ReceberPagamento(double valor)  {
        if(valor <= 0)   {
            System.out.print("\nPagamentos devem ser maiores que Zero\n");
        } else {
            saldoCaixa += valor;
            System.out.print("\nPagamento Bem sucesido\n");
        }
    }

    public void PagarDespesa(double valor)  {
        if(valor > this.saldoCaixa) {
            System.out.print("\nSaldo Insuficiente\n");
        }

    }
}
