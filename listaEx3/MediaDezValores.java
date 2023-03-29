package listaEx3;

import javax.swing.JOptionPane;

public class MediaDezValores {
	public static void main(String[] args) {
		int valor2[] = new int[10];
		int soma = 0;
		
		for(int i=0; i<valor2.length; i++) {
			valor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro"));
			soma = soma + valor2[i];
		}
		int media = soma/valor2.length;
		JOptionPane.showMessageDialog(null, "A Média é: " + media);
	}
}
