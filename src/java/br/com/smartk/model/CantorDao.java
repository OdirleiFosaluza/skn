
package br.com.smartk.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Odirlei
 */
public class CantorDao {
    Connection conexao; 
    
    public CantorDao(){
        this.conexao = new Conexao().getConnection();
    }
    
    public Boolean incluirCantor(Cantor cantor){
        Boolean gravado = false;
        
        String sql = "insert into cantor"+
                "(nome_cantor)" +
                "values(?)";
        
        //PreparedStatement stmt;          
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql)){                        
            stmt.setString(1, cantor.getNome());
            gravado = stmt.execute();
            stmt.close();
            return gravado = true;
        } catch (SQLException ex) {            
            System.out.println("Não gravou o cantor");
        }        
        
        return gravado;
    }
    
    public Boolean alterarCantor(Cantor cantor){
        Boolean alterado = false;
        String sql = "update cantor set nome_cantor=? where id_cantor=?";                                
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {            
            stmt.setString(1, cantor.getNome());
            stmt.setInt(2, cantor.getId());            
            alterado = stmt.execute();
            stmt.close();
            alterado = true;
        } catch (SQLException ex) {
            System.out.println("Não foi possível alterar o cantor");
        }        
        return alterado;    
    }
    
        public List<Cantor> getLista(){
        String sql = "Select * from cantor";        
        List<Cantor> lista = new ArrayList<Cantor>();
        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Cantor cantor = new Cantor();                
                cantor.setId(rs.getInt("id_cantor"));
                cantor.setNome(rs.getString("nome_cantor"));
                lista.add(cantor);
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Boolean excluirCantor(Cantor cantor)
    {
        Boolean retorno; 
        
        String sql = "delete from cantor where id_cantor=?";  
                
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {                   
            stmt.setInt(1, cantor.getId());                  
            retorno = stmt.execute();
            stmt.close();
            return retorno = true;
        } catch (SQLException ex) {            
            System.out.println("Erro ao tentar exlucir cantor! Classe CantorDao");
        } 
        return retorno = false;
    }
    
}
