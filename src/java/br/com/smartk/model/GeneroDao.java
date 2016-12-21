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
public class GeneroDao {
    Connection conexao;
    
    public GeneroDao(){
        this.conexao = new Conexao().getConnection();
    }
    public Boolean adicionarGenero(Genero genero){
    Boolean retorno = false;        
    String sql = "insert into genero"+
            "(nome_genero)"+
            "values(?)";
    System.out.println("AdicionarGenero"+ genero.getNome());
    
    try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql)) {
        stmt.setString(1, genero.getNome());
        retorno = stmt.execute();        
    }catch(SQLException e)
    {
        System.out.println(e.getMessage());
        System.out.println("Catch do Stmt");
    }
    return retorno;
    }
    public List<Genero> getLista(){
        String sql = "select * from genero";
        List<Genero> lista = new ArrayList<Genero>();
        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Genero genero = new Genero();
                genero.setId(rs.getInt("id_genero"));
                genero.setNome(rs.getString("nome_genero"));
                lista.add(genero);
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro no metodo getLista da classe GeneroDao.");
        }
        return null;
    }
    public Boolean excluirGenero(Genero genero)
    {
        Boolean retorno;         
        String sql = "delete from genero where id_genero=?";          
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {                   
            stmt.setInt(1, genero.getId());                  
            retorno = stmt.execute();
            stmt.close();
            return retorno = true;
        } catch (SQLException ex) {
            System.out.println("Erro no metodo getLista da classe GeneroDao.");
        } 
        return retorno = false;
    }
    public Boolean alterarGenero(Genero genero)
    {               
        Boolean retorno = false;
        String sql = "update genero set  nome_genero=? where id_genero=?";                          
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {                   
            stmt.setString(1, genero.getNome());
            stmt.setInt(2, genero.getId());                    
            //Integer valor = stmt.executeUpdate();
            retorno = stmt.execute();
            stmt.close();                    
            return retorno = true;
        } catch (SQLException ex) {                    
            System.out.println("Não alterou genero");
        }      
        return retorno;       
    }
}
