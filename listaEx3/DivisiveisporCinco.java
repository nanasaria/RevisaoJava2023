package listaEx3;

import javax.swing.JOptionPane;

public class DivisiveisporCinco {
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro"));
		
		for(int i=1; i<=valor; i++) {
			
			if(i % 5 == 0 || i % 5 == 5) {
				System.out.println(i);
				}
		}
	}
}
