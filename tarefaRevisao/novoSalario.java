package tarefaRevisao;

import javax.swing.JOptionPane;

public class novoSalario {
	
	public static void main(String[] args) {
	 double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
	 double valperc = Double.parseDouble(JOptionPane.showInputDialog("Informe o Percentual"));
	 porcentagem(salario, valperc);
	}
	
	 public static void porcentagem(double salario, double valperc) {
	 double novoSalario = salario + (salario * (valperc/100));
	 JOptionPane.showMessageDialog(null, "O seu novo salário é:  " +  novoSalario);
      }
}
