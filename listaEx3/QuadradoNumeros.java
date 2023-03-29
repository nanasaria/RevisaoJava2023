package listaEx3;

public class QuadradoNumeros {
	public static void main(String[] args) {
		
			System.out.println("O quadrado dos números entre 40 e 200 são:");
			for(int i=40; i<=200; i++) {
				if(i % 2 == 0) {
				double quadrado = Math.pow(i,2);
				System.out.println(quadrado);
				}
			}
		}
}
