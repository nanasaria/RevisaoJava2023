package tarefaRevisao;

import javax.swing.JOptionPane;

public class salarioLiquido {
	
	public static void main(String[] args) {
		 double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu Salário Atual"));
	     salarioTotal(salario);
		}
		
		 public static void salarioTotal(double salario) {
		 double salarioLiquido = salario - (salario * (27.5/100));
		 JOptionPane.showMessageDialog(null, "O seu salário líquido é:  " +  salarioLiquido);
	      }

}
