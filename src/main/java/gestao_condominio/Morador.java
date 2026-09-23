package gestao_condominio;

public class Morador {
    String nome;
    String cpf;
    int numeroUnidade;

    public Morador(String nome, String cpf, int numeroUnidade)  {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroUnidade = numeroUnidade;
    }

    @Override
    public String toString()    {
        return String.format("Nome: %s | CPF: %s", nome, cpf);
    }
}
