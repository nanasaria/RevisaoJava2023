/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Professor extends PessoaFisica {

    private String funcional;

    public Professor(String funcional, String cpf, int id, String nome) {
        super(id, cpf, nome);
        this.funcional = funcional;
    }

    private Professor(int id,String cpf, String nome) {
        super(id, cpf, nome);
    }

    public Professor(String cpf, String nome) {
        super(cpf, nome);
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        return msg + "Professor{" + "funcional=" + funcional + '}';
    }
    
    
}
