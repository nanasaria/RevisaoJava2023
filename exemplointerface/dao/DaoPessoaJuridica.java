/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.dao;

import exemplointerface.model.bean.PessoaFisica;
import exemplointerface.model.bean.PessoaJuridica;
import java.util.List;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoPessoaJuridica {
    
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
