
package exemploheranca.Heranca1;


public abstract class Figura {
    
    String cor;
    
    public Figura(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString(){
        return "Figura("+ "cor=" + cor + ")";
    }
    
    public abstract double area();
}
