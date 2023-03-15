
package exemplointerface.view;

import exemplointerface.Interfaces.CrudView;
import exemplointerface.controller.ControllerPessoaFisica;
import exemplointerface.model.bean.PessoaFisica;
import javax.swing.JOptionPane;

public class ManterPessoaFisica implements CrudView {

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog("Nome");
        String cpf = JOptionPane.showInputDialog("CPF");
        
        PessoaFisica pfEnt = new PessoaFisica(cpf,nome);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica() {};
        PessoaFisica pfSaida = (PessoaFisica) contPf.inserir(pfEnt);
        
        System.out.println(pfSaida);
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
