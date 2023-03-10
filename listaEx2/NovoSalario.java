package listaEx2;

import javax.swing.JOptionPane;

public class NovoSalario {
	
	public static void main(String[] args) {
		 double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
		 acrescimo(salario);
		}
		
		 public static void acrescimo(double salario) {
		 double acrec = salario + (salario * (20.0/100));
		 JOptionPane.showMessageDialog(null, "O seu salário novo salário acrescido de 20% é:  " +  acrec);
	      }

}
