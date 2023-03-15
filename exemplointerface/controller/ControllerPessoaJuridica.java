
package exemplointerface.controller;

import exemplointerface.dao.DaoPessoaFisica;
import exemplointerface.dao.DaoPessoaJuridica;
import exemplointerface.model.bean.PessoaJuridica;
import java.util.List;


public class ControllerPessoaJuridica {
    DaoPessoaJuridica daoJur;
    
            public PessoaJuridica inserir(PessoaJuridica pjEnt) {
        
        PessoaJuridica pjSaida = new PessoaJuridica("Teste", 1, "CPF");
        return pjSaida;
    }

    public PessoaJuridica alterar(PessoaJuridica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public PessoaJuridica buscar(PessoaJuridica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PessoaJuridica> listar(PessoaJuridica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaJuridica excluir(PessoaJuridica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
