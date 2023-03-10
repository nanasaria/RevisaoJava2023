package tarefaRevisao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class menu {

	public static void main(String[] args) {
		
		Scanner menu = new Scanner(System.in);
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Calculadora (1) "
				+ "\nDiferença de Números (2)"
				+ "\n Calculo Fatorial (3)"
				+ "\n Salário com aumento percentual (4)"
				+ "\n Salário Líquido com Imposto de Renda (5)"));
		 
		 
		 executando(opcao);
	}
	
	public static void executando(int opcao) {
		switch (opcao) {

		case 1:
			calculadoraSimples Calculadora = new calculadoraSimples();
			Calculadora.main(null);
		break;

		case 2:
			calculoDiferenca Diferenca = new calculoDiferenca();
			Diferenca.main(null);
		break;

		case 3:
			fatorial CalcFatorial = new fatorial();
			CalcFatorial.main(null);
		break;
		
		case 4:
			novoSalario salarioNovo = new novoSalario();
			salarioNovo.main(null);
			break;
			
		case 5:
			salarioLiquido salarioIR = new salarioLiquido();
			salarioIR.main(null);
			break;

		default:
			return;
		}
	}
}
