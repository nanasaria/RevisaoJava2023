package listaEx3;

public class NumerosPares {
	public static void main(String[] args) {
		
		System.out.println("Os números pares de 1 a 100 são:");
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
	}
}
