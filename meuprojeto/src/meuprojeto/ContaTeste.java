
package meuprojeto;


public class ContaTeste {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente = "Daniel";
        conta.saldo = 4_000.00;
        conta.exibirSaldo();
    }
}
