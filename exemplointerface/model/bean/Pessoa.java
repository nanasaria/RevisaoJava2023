
package exemplointerface.model.bean;

public class Pessoa {
    int id;
    String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
