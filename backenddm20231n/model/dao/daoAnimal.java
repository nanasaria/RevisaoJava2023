package backenddm20231n.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import backenddm20231n.model.bean.Animal;
import backenddm20231n.util.ConexaoDb;

public class daoAnimal {
private final Connection c;
    
    public daoAnimal() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }

    public Animal excluir(Animal animalEnt) throws SQLException{
        String sql = "delete from Animals WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,animalEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return animalEnt;
    }
    
    public Animal buscar(Animal animalEnt) throws SQLException{
        String sql = "select * from Animals WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,animalEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Animal animalSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                animalSaida = new Animal(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return animalSaida;
   }

    public Animal inserir(Animal animalEnt) throws SQLException{
        String sql = "insert into Animals" + " (animal, raca, peso, doenca, prontuario)" + " values (?,?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,animalEnt.getAnimal());
        stmt.setString(2,animalEnt.getRaca());
        stmt.setString(3,animalEnt.getPeso());
        stmt.setString(4,animalEnt.getDoenca());
        stmt.setString(5,animalEnt.getProntuario());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            animalEnt.setId(id);
        }
        stmt.close();
        return animalEnt;
    }

    public Animal alterar(Animal animalEnt) throws SQLException{
        String sql = "UPDATE Animals SET cep = ?, numero = ?, compl = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,animalEnt.getAnimal());
        stmt.setString(2,animalEnt.getRaca());
        stmt.setString(3,animalEnt.getPeso());
        stmt.setString(4,animalEnt.getDoenca());
        stmt.setString(5,animalEnt.getProntuario());
        stmt.setInt(6,animalEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return animalEnt;
    }

   public List<Animal> listar(Animal animalEnt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Animal> animals = new ArrayList<>();
        
        String sql = "select * from Animals where cep like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + animalEnt.getAnimal() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Animal animal = new Animal(
            		rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6));
            // adiciona o usu à lista de usus
            animals.add(animal);
        }
        
        rs.close();
        stmt.close();
        return animals;
   
   }
}
