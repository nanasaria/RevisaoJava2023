/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;

import exemplointerface.dao.DaoPessoaFisica;
import exemplointerface.model.bean.PessoaFisica;
import java.util.List;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerPessoaFisica{

    DaoPessoaFisica daoPes;
    
    public PessoaFisica inserir(PessoaFisica pfEnt) {
        daoPes = new DaoPessoaFisica();
        PessoaFisica pfSaida = new PessoaFisica(1, "Teste", "CPF");
        return pfSaida;
    }

    public PessoaFisica alterar(PessoaFisica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public PessoaFisica buscar(PessoaFisica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PessoaFisica> listar(PessoaFisica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaFisica excluir(PessoaFisica obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
