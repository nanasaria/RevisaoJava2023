package listaEx2;

import javax.swing.JOptionPane;

public class TrocaXeY {
	public static void main(String[] args) {
		
		int x = Integer. parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		int y = Integer. parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro"));
		
		troca(x,y);
	}
	
	public static void troca(int x, int y) {
	 
	 JOptionPane.showMessageDialog(null, "O primeiro valor é "+y+" \nO segundo valor é "+x);
	}
}
