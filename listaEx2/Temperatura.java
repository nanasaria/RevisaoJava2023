package listaEx2;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		
		double temp1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira temperatura"));
		double temp2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda temperatura"));
		double temp3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira temperatura"));
			
		temperaturaNegativa(temp1, temp2, temp3);
		}
		
		public static void temperaturaNegativa(double temp1, double temp2, double temp3) {
			
		if(temp1 < 0) {
			JOptionPane.showMessageDialog(null, "A temperatura "+temp1+"- C° está negativa");
			
			if(temp2<0) {
				JOptionPane.showMessageDialog(null, "A temperatura "+temp2+"- C° está negativa");
				
				if(temp3<0) {
					JOptionPane.showMessageDialog(null, "A temperatura "+temp3+"- C° está negativa");
				}
				
			}else {
				if(temp3<0) {
					JOptionPane.showMessageDialog(null, "A temperatura "+temp3+"- C° está negativa");
				}else {
					JOptionPane.showMessageDialog(null, "Não há temperaturas negativas!");
				}
			}
				
		}else {
			if(temp2<0) {
				JOptionPane.showMessageDialog(null, "A temperatura "+temp2+"- C° está negativa");
				
				if(temp3<0) {
					JOptionPane.showMessageDialog(null, "A temperatura "+temp3+"- C° está negativa");
				}else {
					JOptionPane.showMessageDialog(null, "Não há temperaturas negativas!");
				}
				}else {
					JOptionPane.showMessageDialog(null, "Não há temperaturas negativas!");
				}
		}
		 
	  
	}
}
