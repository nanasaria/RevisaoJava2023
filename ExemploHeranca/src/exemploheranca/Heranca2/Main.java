
package exemploheranca.Heranca2;

import java.util.ArrayList;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {
    
    public static void main(String[] args){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("XPO-097", 2010));
        veiculos.add(new Veiculo("XER-087", 2011));
        veiculos.add(new Veiculo("ERT-076", 2015));
        veiculos.add(new Veiculo("RYU-098", 2020));
        veiculos.add(new Veiculo("HGR-023", 2013));
        
         ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        
           veiculos.add(new Caminhao("HJU-3341", 2000, 7));
            veiculos.add(new Caminhao("HBG-5563", 2011, 8));
            veiculos.add(new Caminhao("USH-7372", 2020, 7));
            veiculos.add(new Caminhao("BVS-9832", 2013, 4));
            veiculos.add(new Caminhao("SUS-7623", 2015, 6));
           
           for(Veiculo veiculo:veiculos){
               veiculo.exibirDados();
           }
           
            for(Caminhao caminhao:caminhoes){
               caminhao.exibirDados();
           }
        
        
    }
}
