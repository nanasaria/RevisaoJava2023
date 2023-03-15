
package exemplointerface.model.bean;
import exemplointerface.model.bean.Pessoa;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(int id, String cpf, String nome) {
        super(id, nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        return msg + "PessoaFisica{" + "cpf=" + cpf + '}';
    }
    
    
}
