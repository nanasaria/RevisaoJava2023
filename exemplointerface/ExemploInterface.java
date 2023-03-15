
package exemplointerface;

import exemplointerface.model.bean.Pessoa;
import exemplointerface.model.bean.PessoaFisica;
import exemplointerface.model.bean.PessoaJuridica;
import exemplointerface.model.bean.Professor;
import exemplointerface.view.ManterPessoaFisica;
import exemplointerface.view.ManterPessoaJuridica;
import exemplointerface.view.ManterProfessor;
import java.util.ArrayList;
import java.util.List;


public class ExemploInterface {

    public static void main(String[] args) {
    List<Object> listaObjetos = new ArrayList<Object>();
    Pessoa p = new Pessoa(1, "Adalberto");
    PessoaFisica pf = new PessoaFisica(2, "78287287623", "Claudovil");
    Professor prof = new Professor("XXX", "534.765.762-87", 7, "Estephanio");
    PessoaJuridica pj = new PessoaJuridica("782.872.876/0001-98", 4, "Adolfo");
    listaObjetos.add(p);
    listaObjetos.add(pf);
    listaObjetos.add(prof);
    for(Object o : listaObjetos){
    System.out.print(o);
    }
    
        ManterPessoaFisica mpf = new ManterPessoaFisica();
        mpf.inserir();
        
        ManterProfessor mprof = new ManterProfessor();
        mprof.inserir();
        
        ManterPessoaJuridica mpj = new ManterPessoaJuridica();
        mpj.inserir();
    }
    
    
}
