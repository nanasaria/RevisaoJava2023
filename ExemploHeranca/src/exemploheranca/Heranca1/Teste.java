
package exemploheranca.Heranca1;

public class Teste {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado("Roxo", 4.0);
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32.0, 12.0);
        
        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);
    }
    
}
