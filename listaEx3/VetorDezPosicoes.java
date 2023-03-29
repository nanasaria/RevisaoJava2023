package listaEx3;

import javax.swing.JOptionPane;

public class VetorDezPosicoes {
	public static void main(String[] args) {
		int valor2[] = new int[10];
		
		for(int i=0; i<valor2.length; i++) {
			valor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro"));
			System.out.println(valor2[i]);
		}
	}
}
