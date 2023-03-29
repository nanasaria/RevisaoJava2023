package listaEx3;

import javax.swing.JOptionPane;

public class SaldosBancarios {
	
	public static void main(String[] args) {
		int valor2[] = new int[4];
		int soma = 0;
		int media = 0;
		int negativo = 0;
		
		for(int i=0; i<valor2.length; i++) {
			valor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro"));
			
			if(valor2[i] > 0) {
				soma = soma + valor2[i];
			    media = soma/valor2.length;
			}
			else {
				negativo++;
			}	
		}
		if(media >= 100 && media <= 1000) {
			JOptionPane.showMessageDialog(null, "A Média dos valores positivos entre 100 a 1000: " + media);
		}
		JOptionPane.showMessageDialog(null, "A Quantidade de Valores Negativos são: " + negativo);
	}

}
