package listaEx2;

import javax.swing.JOptionPane;

public class MaiorMenor {
public static void main(String[] args) {
		
		int n1 = Integer. parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		int n2 = Integer. parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro"));
		
		troca(n1,n2);
	}
	
	public static void troca(int n1, int n2) {
	 
	 if(n1 > n2) {
		 int result = n1 - n2;
		 JOptionPane.showMessageDialog(null, "O resultado é "+result);
	 }else {
		 int result = n2 - n1;
		 JOptionPane.showMessageDialog(null, "O resultado é "+result);
	 }
	}
}
