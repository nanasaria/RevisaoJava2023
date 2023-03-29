package listaEx3;

public class ParesImpares {
	public static void main(String[] args) {
		int soma = 0;
		int negativo = 0;
		
			for(int i=1; i<=800; i++) {
				if(i % 2 == 0) {
					soma = soma + i;
				}
				else {
					negativo++;
				}	
			}
			System.out.println("A soma dos números pares é: " + soma);
			System.out.println("A quantidade de números ímpares: " + negativo);
		}
}
