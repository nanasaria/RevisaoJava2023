package listaEx2;

import javax.swing.JOptionPane;

public class MediaAluno {
	
	public static void main(String[] args) {
		 double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
		 double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
		 double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota"));
		 media(nota1, nota2, nota3);
		}
		
		 public static void media(double nota1, double nota2, double nota3) {
		 
			if(nota1>= 6.0 && nota2>= 6.0 && nota3>=6) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado!");
	      }else {
	    	  double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Aluno em recuperação"
	    	  		+ "\nInsira a quarta nota"));
	    	  if(nota4 >= 6.0) {
	    		  JOptionPane.showMessageDialog(null, "Aluno Aprovado!");
	    	  }else {
	    		  JOptionPane.showMessageDialog(null, "Aluno Reprovado!");
	    	  }
	      }
	}
}
