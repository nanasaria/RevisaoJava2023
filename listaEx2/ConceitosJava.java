package listaEx2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConceitosJava {

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção"
				+ "\nPseudocódigo (1) "
				+ "\nFluxograma (2)"
				+ "\nEstruturas sequenciais (3)"
				+ "\nEstruturas de decisões (4)"
				+ "\nMétodos com retorno (5)"
				+ "\nMétodos sem retorno (6)"
				+ "\nExceções (7)"
				+ "\nPrincipais recursos de orientação a objetos (8)"));
		 
		 
		 executando(opcao);
	}
	
	public static void executando(int opcao) {
		
		
		switch (opcao) {

		case 1:
			JOptionPane.showMessageDialog(null, "O Pseudocódigo é um método de descrever um código de programação "
					+ "\nusando uma linguagem natural, como o português. Pseudocódigo nada mais é do que uma descrição "
					+ "\ndo que um código deve fazer.\r\n"
					+ "	Exemplo de ferramenta de pseudocódigo é o Portugol.\r\n");
		break;

		case 2:
			JOptionPane.showMessageDialog(null, "Fluxograma é uma representação gráfica que descreve etapas de um processo, "
			 		+ "\nestruturado por símbolos geométricos que simbolizam materiais, serviços ou recursos envolvidos nos processos "
			 		+ "\ne quais as direções a serem seguidas a fim de que se atinja o resultado esperado.");
			
		break;

		case 3:
			JOptionPane.showMessageDialog(null, "Estruturas sequenciais são ações desenvolvidas seguindo uma ordem em que se realiza uma "
			 		+ "\nação após a outra até que todas sejam concluídas.");
			 
		break;
		
		case 4:
			JOptionPane.showMessageDialog(null, "Estruturas de decisões são instruções onde se faz uma pergunta, por exemplo:"
			 		+ " \n“ O valor 1 é inteiro?” se a resposta for sim (true), o programa continua seguindo uma instrução ou conjunto "
			 		+ "\nde instruções e se a resposta for não (false) se segue outro tipo de instrução denominada para a condição falsa.");
			 break; 
		case 5:
			
			JOptionPane.showMessageDialog(null, "Métodos com retorno são métodos que possuem um tipo de dados e em seu corpo apresentam a palavra"
					+ "\n “return” informando que o método deve retornar o mesmo tipo de dados que foi declarado.");
			 break;
		case 6:
			
			 JOptionPane.showMessageDialog(null, "Métodos sem retorno são usados para alterar algum dado no sistema, mas sem retorno, como por exemplo, "
			 		+ "\num método setNome. São chamados de método Void, que não retornam nada (vazio).");

			 break;
		case 7:
			
			 JOptionPane.showMessageDialog(null, "Exceções indicam que algum erro aconteceu no código durante a execução e impedem que o programa continue "
			 		+ "\nseu fluxo até que o erro seja resolvido.");
			 break;

		case 8:
			
			Scanner scan = new Scanner(System.in);
			
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção"
					+ "\nClasses (1) "
					+ "\nObjetos (2)"
					+ "\nAssociação (3)"
					+ "\nEncapsulamento (4)"
					+ "\nHerança (5)"
					+ "\nPolimorfismo (6)"
					+ "\nSair(7)"));
			
					
					switch(menu){
				     case 1:
				    	 JOptionPane.showMessageDialog(null, "A classe é uma forma de definir um tipo de dado. "
				    	 		+ "\nFormada por dados e comportamentos.");
				       break;
				     case 2:
				    	 JOptionPane.showMessageDialog(null, "Um objeto pode ser uma variável, função ou estrutura de dados,"
				    	 		+ "\n refere-se a um molde que passa a existir a partir de uma instância da classe.");
				       break;
				     case 3:
				    	 JOptionPane.showMessageDialog(null, "A associação define um relacionamento entre duas classes "
				    	 		+ "\nque permite a um objeto realizar uma ação em seu lugar. ");
				       break;
				     case 4:
				    	 JOptionPane.showMessageDialog(null, "Encapsulamento orienta esconder funcionalidades e funcionamentos "
				    	 		+ "\ndo código dentro de pequenas unidades (normalmente métodos e funções).");
				       break;
				     case 5:
				    	 JOptionPane.showMessageDialog(null, "A herança é uma relação em que uma classe herda de outra.");
				       break;
				     case 6:
				    	JOptionPane.showMessageDialog(null, "O polimorfismo é a possibilidade de implementar métodos em uma " + 
				         "\n hierarquia de classes sem a necessidade de implementações específicas, ou seja, utilizar "
				    	+ "\no mesmo código de outra maneira em outras classes.");
				       break;
				     case 7:
				    	 scan.close();
				       break;
				     default:
				    	 scan.close();
				   }	
		default:
		 return;
		}
	}
}
