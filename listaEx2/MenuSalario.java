package listaEx2;


import javax.swing.JOptionPane;

public class MenuSalario {
	
	public static void main(String[] args) {
		
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção"
				+ "\nAcréscimo de 30% (1) "
				+ "\nAcréscimo de 40% (2)"
				+ "\n Acréscimo de 50% (3)"
				+ "\n Acréscimo de 60% (4)"));
		 
		 
		 executando(opcao, salario);
	}
	
	public static void executando(int opcao, double salario) {
		switch (opcao) {

		case 1:
			double acres30 = salario + (salario * (30.0/100));
			 JOptionPane.showMessageDialog(null, "O seu salário novo salário acrescido de 30% é:  " +  acres30);
		break;

		case 2:
			double acres40 = salario + (salario * (40.0/100));
			 JOptionPane.showMessageDialog(null, "O seu salário novo salário acrescido de 40% é:  " +  acres40);
		break;

		case 3:
			double acres50 = salario + (salario * (50.0/100));
			 JOptionPane.showMessageDialog(null, "O seu salário novo salário acrescido de 50% é:  " +  acres50);
		break;
		
		case 4:
			double acres60 = salario + (salario * (60.0/100));
			 JOptionPane.showMessageDialog(null, "O seu salário novo salário acrescido de 60% é:  " +  acres60);

		default:
			return;
		}
	}
}
