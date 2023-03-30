package backenddm20231n.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import backenddm20231n.model.bean.Consulta;
import backenddm20231n.util.ConexaoDb;

public class DaoConsulta {
	private final Connection c;
    
    public DaoConsulta() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDb.getConexaoMySQL();
    }

    public Consulta excluir(Consulta consEnt) throws SQLException{
        String sql = "delete from Consultas WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,consEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return consEnt;
    }
    
    public Consulta buscar(Consulta consEnt) throws SQLException{
        String sql = "select * from Consultas WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,consEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Consulta consSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                consSaida = new Consulta(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return consSaida;
   }

    public Consulta inserir(Consulta consEnt) throws SQLException{
        String sql = "insert into Consultas" + " (dia_consulta, hora_consulta, clinica, veterinario)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,consEnt.getDia());
        stmt.setString(2,consEnt.getHora());
        stmt.setString(3,consEnt.getClinica());
        stmt.setString(4,consEnt.getVet());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            consEnt.setId(id);
        }
        stmt.close();
        return consEnt;
    }

    public Consulta alterar(Consulta consEnt) throws SQLException{
        String sql = "UPDATE Consultas SET dia_consulta = ?, hora_consulta = ?, clinica = ?, veterinario = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,consEnt.getDia());
        stmt.setString(2,consEnt.getHora());
        stmt.setString(3,consEnt.getClinica());
        stmt.setString(4,consEnt.getVet());
        stmt.setInt(5,consEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return consEnt;
    }

   public List<Consulta> listar(Consulta consEnt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Consulta> listaconss = new ArrayList<>();
        
        String sql = "select * from Consultas where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + consEnt.getDia() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Consulta cons = new Consulta(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)
            );
            // adiciona o usu à lista de usus
            listaconss.add(cons);
        }
        
        rs.close();
        stmt.close();
        return listaconss;
   
   }
}
