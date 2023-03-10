package listaEx2;

import javax.swing.JOptionPane;

public class NotaProva {

public static void main(String[] args) {
		
	double notaProfessor = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova do professor"));
	double notaProvaGeral = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova geral"));
		
	trueOrFalse(notaProfessor, notaProvaGeral);
	}
	
	public static void trueOrFalse(double notaProfessor, double notaProvaGeral) {
		
	if(notaProfessor > 6.0 || notaProvaGeral > 6.0) {
		JOptionPane.showMessageDialog(null, "True");
	}else {
		JOptionPane.showMessageDialog(null, "False");
	}
	 
  }
	
}
