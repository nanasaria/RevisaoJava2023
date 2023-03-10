package tarefaRevisao;

import javax.swing.JOptionPane;

public class fatorial {
	
	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		double f = num;
	    fatorial(num, f);
	}
	
	public static void fatorial(double num, double f) {
		 while(num > 1) {
			 f *= (num-1);
	            num--; 
		 }
		 JOptionPane.showMessageDialog(null, "O resultado fatorial é:  " +  f);
	  }
}
