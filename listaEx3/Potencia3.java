package listaEx3;

public class Potencia3 {
	public static void main(String[] args) {
		
		System.out.println("0 a 15 em Potências de 3");
		for(double i=0; i<=15; i++) {
			double potencia = Math.pow(i, 3);
			System.out.println(potencia);
		}
	}
}
