package JavaDeveloper;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
	    
	    System.out.printf("Informe o número da conta: ");
	    int Num = ler.nextInt();
	    
	    System.out.printf("Informe a Agência:  ");
	    String Agencia = ler.next();
	    
	    System.out.printf("Informe seu nome:  ");
	    String NomeCli = ler.next();
	    
	    System.out.printf("Informe o saldo:  ");
	    double Saldo = Double.parseDouble(ler.next());
	    
	    System.out.print("Olá  " +NomeCli+ ", obrigado por criar uma conta em nosso banco,\n"
	    		+ "sua agência é "+Agencia+", conta "+Num+"\ne seu saldo "+Saldo
	    		+" já está disponível para saque.");
	    
	}
}
