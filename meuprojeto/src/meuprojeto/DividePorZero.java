
package meuprojeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;
      do{
        try{
            
            System.out.print("Número: ");
            int a = s.nextInt();
            System.out.print("Divisor: ");
            int b = s.nextInt();
            
            System.out.println(a / b);
            continuar = false;
        }
        catch(InputMismatchException el){
            System.out.println("Favor inserir números inteiros");
            s.nextLine();
        }
        catch(Throwable e2){
            System.out.println("O divisor deve ser diferente de zero!");
        }
        finally{
            System.out.println("finally executando...");
        }
      } while(continuar);
    }
      
}
