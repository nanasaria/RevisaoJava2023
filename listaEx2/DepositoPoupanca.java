package listaEx2;

import javax.swing.JOptionPane;

public class DepositoPoupanca {
	
	public static void main(String[] args) {
		 double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Depósito"));
		 aplicacao(deposito);
		}
		
		 public static void aplicacao(double deposito) {
		 double acrescimo = deposito + (deposito * (1.3/100));
		 JOptionPane.showMessageDialog(null, "O valor após 1 mês de aplicação é:  " +  acrescimo);
	      }
}
