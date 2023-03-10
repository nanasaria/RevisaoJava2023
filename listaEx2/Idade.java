package listaEx2;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		int year = c.get(Calendar.YEAR);
		int anoNasc = Integer. parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento"));
		idade(year, anoNasc);
	}
	
	public static void idade(int year, int anoNasc) {
	 int idadeAtual = year - anoNasc;
	 int idadeCalc = idadeAtual + 25;
	 int ano = year + 25;
	 
	 JOptionPane.showMessageDialog(null, "A sua idade é: "+idadeAtual + " anos"
			 +"\nDaqui a 25 anos, em " + ano +", você terá: "+idadeCalc + " anos"
			 		+ "\n Lembrando que caso você ainda não tenha completado \nessa idade, diminua em 1 ano");
	}
}
