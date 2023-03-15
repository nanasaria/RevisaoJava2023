
package exemplointerface.model.bean;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String cnpj, int id, String nome) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(int id, String nome) {
        super(id, nome);
    }

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }
    
    
}
