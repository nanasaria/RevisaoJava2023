
package exemploheranca.Heranca1;

public class Retangulo extends Figura {
    private Double lado1;
    private Double lado2;
    
    public Retangulo(String cor, Double lado1, Double lado2){
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public double area(){
        return this.lado1*this.lado2;
    }
    
    @Override
    public String toString(){
        return "Retangulo [lado1 = " + lado1 + ", lado2= " + lado2 + ", cor= " + super.getCor() + "]";
    }
}