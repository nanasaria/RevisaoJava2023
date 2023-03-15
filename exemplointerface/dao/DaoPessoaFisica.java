
package exemplointerface.dao;

import exemplointerface.model.bean.PessoaFisica;
import java.util.List;


public class DaoPessoaFisica {

    public PessoaFisica alterar(PessoaFisica pfEnt){
        PessoaFisica pfSaida = new PessoaFisica(1, "Teste", "CPF");
        return pfSaida;
    }
    
    
    public PessoaFisica excluir(PessoaFisica pfEnt){
        
        return null;
    }
    
    public PessoaFisica buscar(PessoaFisica pfEnt){  
        return null;
    }
    
    public List<PessoaFisica> listar(PessoaFisica pfEnt){
       return null;
    }
    
}
