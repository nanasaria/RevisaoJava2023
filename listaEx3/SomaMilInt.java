package listaEx3;

import javax.swing.JOptionPane;

public class SomaMilInt {
	public static void main(String[] args) {
		int soma = 0;
		
		for(int i=0; i<=1000; i++) {
			soma = soma + i;
		}
		JOptionPane.showMessageDialog(null, "Total: " + soma);
	}
}
