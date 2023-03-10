package listaEx2;


import javax.swing.JOptionPane;

public class MaiorQueMenorQue {
	public static void main(String[] args) {
		int n1 = Integer. parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		int n2 = Integer. parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro"));
		int n3 = Integer. parseInt(JOptionPane.showInputDialog("Informe o terceiro valor inteiro"));
		dentro(n1,n2,n3);
		}
		
		 public static void dentro(int n1, int n2, int n3) {
			 
				 if(n1<100 || n1>1000) {
					 System.out.println(n1);
					 if(n2<100 || n2>1000) {
						 System.out.println(n2);	 
						 if(n3<100 || n3>1000) {
							 System.out.println(n3);
						 }
					 }else{
						 if(n2<100 || n2>1000) {
							 System.out.println(n2);
							 if(n3<100 || n3>1000) {
								 System.out.println(n3);
							 }}
						 else {
							 if(n3<100 || n3>1000) {
								 System.out.println(n3);}
							 }
					 }
					 
				 }else {
					 if(n2<100 || n2>1000) {
						 System.out.println(n2);
						 if(n3<100 || n3>1000) {
							 System.out.println(n3);
						 }}
					 else {
						 if(n3<100 || n3>1000) {
							 System.out.println(n3);}
						 }
				 }
	      }
}
