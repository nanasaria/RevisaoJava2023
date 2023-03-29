package listaEx3;

import javax.swing.JOptionPane;

public class CalculoFatorial {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		double f = 1.0;
	 
		for(double i = num; i>1.0; i--) {
			f = f*i;
		}
		JOptionPane.showMessageDialog(null, "O resultado fatorial é:  " +  f);
	}
		 
}

