package tarefaRevisao;

import javax.swing.JOptionPane;

public class calculoDiferenca {

	public static void main(String[] args) {
		 double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º Número"));
		 double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º Número"));
		 diferenca(valor1, valor2);
		}
		
		 public static void diferenca(double valor1, double valor2) {
		 double result = valor1 - valor2;
		 JOptionPane.showMessageDialog(null, "A Diferença é:  " + result);
	      }
}
