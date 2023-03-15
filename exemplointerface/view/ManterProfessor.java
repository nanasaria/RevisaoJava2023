
package exemplointerface.view;

import exemplointerface.Interfaces.CrudView;
import exemplointerface.controller.ControllerPessoaFisica;
import exemplointerface.controller.ControllerProfessor;
import exemplointerface.model.bean.PessoaFisica;
import exemplointerface.model.bean.Professor;
import javax.swing.JOptionPane;

public class ManterProfessor implements CrudView{

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog("Nome");
        String cpf = JOptionPane.showInputDialog("CPF");
        
        Professor profEnt = new Professor(cpf,nome);
        ControllerProfessor contProf = new ControllerProfessor();
        Professor profSaida = (Professor) contProf.inserir(profEnt);
        
        System.out.println(profSaida);
    }

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
