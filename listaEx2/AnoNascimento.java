package listaEx2;

import javax.swing.JOptionPane;

public class AnoNascimento {

	public static void main(String[] args) {
		int dia = Integer. parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento"));
		int mes = Integer. parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento"
				+ "\nExemplo (01)"));
		int ano = Integer. parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento"));
		
		anoNasc(ano, mes, dia);
	}
	
	public static void anoNasc(int ano, int mes, int dia) {
	 
	 JOptionPane.showMessageDialog(null, dia+"/"+mes+"/"+ano);
	}
}
