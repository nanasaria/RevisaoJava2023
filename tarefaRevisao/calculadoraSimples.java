package tarefaRevisao;

import javax.swing.JOptionPane;

public class calculadoraSimples {
	
	public static void main(String[] args){
		 int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Subtração (1) \nSoma(2)\nMultiplicação(3)\nDivisão(4)"));
		 double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1° Número: "));
		 double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2° Número: "));
		 
		 int soma = 2;
		 int sub = 1;
		 int mult = 3;
		 int div = 4;
		 
		 if(pergunta == soma) {
			 soma(valor1, valor2);
			}else if(pergunta == sub) {
			 sub(valor1, valor2);
			}else if(pergunta == mult) {
			 mult(valor1, valor2);
			}else if(pergunta == div) {
			 div(valor1, valor2);
			}else {
			JOptionPane.showMessageDialog(null, "Insira uma operação");
		 }
	}
	
	public static void soma(double valor1, double valor2) {
		double resultadoSoma = valor1 + valor2;
		JOptionPane.showMessageDialog(null, "O Resultado da Soma é:  "+ resultadoSoma);
	    }
	
	public static void sub(double valor1, double valor2) {
	    double subtracao = valor1 - valor2;
		JOptionPane.showMessageDialog(null, "O Resultado da Subtração é:  "+ subtracao);
	    }
	public static void mult(double valor1, double valor2) {
		double multiplicacao = valor1 * valor2;
		JOptionPane.showMessageDialog(null, "O Resultado da Multiplicação é:  "+ multiplicacao);
	    }
	public static void div(double valor1, double valor2) {
		double divisao = valor1 / valor2;
		JOptionPane.showMessageDialog(null, "O Resultado da Divisão é:  "+ divisao);
	    }
}
