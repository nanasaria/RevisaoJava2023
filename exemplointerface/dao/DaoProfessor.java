
package exemplointerface.dao;

import exemplointerface.model.bean.Professor;
import java.util.List;


public class DaoProfessor {
    
    public Professor inserir(Professor profEnt) {
        Professor profSaida = new Professor("XXX","CPF", 1, "Teste");
        return profSaida;
    }

    public Professor alterar(Professor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Professor buscar(Professor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Professor> listar(Professor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Professor excluir(Professor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
