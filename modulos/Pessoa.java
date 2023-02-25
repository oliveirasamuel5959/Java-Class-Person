package modulos;

public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private String company_name;

    public void setCompany(String company_name)
    {
        this.company_name = company_name;
    }

    public String getCompany()
    {
        return company_name;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getIdade()
    {
        return idade;
    }

}
