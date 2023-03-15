
package exemploheranca.Heranca1;

public class Quadrado extends Retangulo {
    
    public Quadrado(String cor, double lado){
        super(cor, lado, lado);
    }
    
    
    @Override
    public double area(){
        return this.getLado1() * this.getLado1();
    }
    
    @Override
    public String toString(){
        return "Quadrado [area() = " + area() + ", cor= " + super.getCor() + "]";
    }
}
