
package exemplointerface.view;

import exemplointerface.Interfaces.CrudView;
import exemplointerface.controller.ControllerPessoaJuridica;
import exemplointerface.model.bean.PessoaJuridica;
import javax.swing.JOptionPane;

public class ManterPessoaJuridica implements CrudView {

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir() {
       String nome = JOptionPane.showInputDialog("Nome");
        String cnpj = JOptionPane.showInputDialog("CNPJ");
        
        PessoaJuridica pjEnt = new PessoaJuridica(cnpj,nome);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica() {};
        PessoaJuridica pjSaida = (PessoaJuridica) contPj.inserir(pjEnt);
        
        System.out.println(pjSaida);
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
