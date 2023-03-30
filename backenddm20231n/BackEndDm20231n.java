/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231n;

import backenddm20231n.view.ManterAnimal;
import backenddm20231n.view.ManterConsulta;
import backenddm20231n.view.ManterLogradouro;
import backenddm20231n.view.ManterPessoa;
import backenddm20231n.view.ManterPessoasLogradouros;
import backenddm20231n.view.ManterUsuario;
import backenddm20231n.view.ManterUsuariosPessoas;
import backenddm20231n.view.ManterVeterinario;
import backenddm20231n.view.ManterVeterinarioPessoas;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BackEndDm20231n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if(ManterUsuario.validar()) {
            menu();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario Inválido");            
        }
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        String msg = " 0 - Sair \n 1 - Usuario \n 2 - Pessoa \n 3 - Logradouro \n 4 - PessoasLogradouros "
        		+ "\n 5 - UsuariosPessoas \n 6 - Animal \n 7 - Consulta \n 8 - Veterinário \n 9 - VeterinarioPessoas \n";
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
                if (sair > 0) menu();
                break;
            case 1:
                ManterUsuario.menu();
                break;
            case 2:
                ManterPessoa.menu();
                break;
            case 3:
                ManterLogradouro.menu();
                break;
            case 4:
                ManterPessoasLogradouros.menu();
                break;
            case 5:
                ManterUsuariosPessoas.menu();
                break;
                
            case 6:
                ManterAnimal.menu();
                break;
                
            case 7:
                ManterConsulta.menu();
                break;
             
            case 8:
                ManterVeterinario.menu();
                break;
                
            case 9:
                ManterVeterinarioPessoas.menu();
                break;
                
            default:
                System.out.println("Opção inválido");
        }
    }
    
}
