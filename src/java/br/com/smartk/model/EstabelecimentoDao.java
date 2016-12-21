
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
public class EstabelecimentoDao {
    
    Connection conexao;
    
    public EstabelecimentoDao(){
        this.conexao = new Conexao().getConnection();
    }
    public Boolean incluirEstabelecimento(Estabelecimento estabelecimento){
        
        String sql = "insert into estabelecimento"+
                        "(nome_estabelecimento, endereco_estabelecimento, complemento_estabelecimento, bairro_estabelecimento, cidade_estabelecimento, uf_estabelecimento, latitude_estabelecimento, longitude_estabelecimento)"+
                        "values(?,?,?,?,?,?,?,?)";        
        Boolean gravado=false;
        
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {                 
            stmt.setString(1, estabelecimento.getNome());
            stmt.setString(2, estabelecimento.getEndereco());
            stmt.setString(3, estabelecimento.getComplemento());
            stmt.setString(4, estabelecimento.getBairro());
            stmt.setString(5, estabelecimento.getCidade());
            stmt.setString(6, estabelecimento.getUf());
            stmt.setFloat(7, estabelecimento.getLatitude());            
            stmt.setFloat(8, estabelecimento.getLongitude());                                    
            gravado = stmt.execute();
            gravado=true;
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não gravou o Estabelecimento");
        } 
        
        
        return gravado;
    }
     public List<Estabelecimento> getLista() 
    {
        String sql = "Select * from estabelecimento";
        List<Estabelecimento> lista = new ArrayList<Estabelecimento>() ;               
        try 
        {                
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                Estabelecimento estabelecimento =  new Estabelecimento();
                estabelecimento.setId(rs.getInt("id_estabelecimento"));
                estabelecimento.setNome(rs.getString("nome_estabelecimento"));
                estabelecimento.setEndereco(rs.getString("endereco_estabelecimento"));
                estabelecimento.setBairro(rs.getString("bairro_estabelecimento"));
                estabelecimento.setComplemento(rs.getString("complemento_estabelecimento"));
                estabelecimento.setCidade(rs.getString("cidade_estabelecimento"));
                estabelecimento.setUf(rs.getString("uf_estabelecimento"));
                estabelecimento.setPass(rs.getString("pass_estabelecimento"));
                estabelecimento.setLatitude(rs.getFloat("latitude_estabelecimento"));
                estabelecimento.setLongitude(rs.getFloat("longitude_estabelecimento"));
                lista.add(estabelecimento);                
            }
            rs.close();
            stmt.close();
            return lista;
            
        }catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
        }                 
     
    public Boolean excluirEstabelecimento(Estabelecimento estabelecimento)
    {
        Boolean retorno; 
        
        String sql = "delete from estabelecimento where id_estabelecimento=?";  
        
        //String sql = "update usuario set email_usuario = ? where login_usuario=?" ;
                try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
                {                   
                    stmt.setInt(1, estabelecimento.getId());                  
                    retorno = stmt.execute();
                    stmt.close();
                    return retorno = true;
                } catch (SQLException ex) {                    
                    System.out.println("Não excluiu o estabelecimento. Erro na classe EstabelecimentoDao");
                } 
        return retorno = false;
    }
    public Boolean alterarEstabelecimento(Estabelecimento estabelecimento){
        Boolean retorno = false;
        String sql = "update estabelecimento set nome_estabelecimento=?, endereco_estabelecimento=?, complemento_estabelecimento=?, bairro_estabelecimento=?, cidade_estabelecimento=?, uf_estabelecimento=?, latitude_estabelecimento=?, longitude_estabelecimento=? where id_estabelecimento=?";
        try(PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {
            stmt.setString(1, estabelecimento.getNome());
            stmt.setString(2, estabelecimento.getEndereco());
            stmt.setString(3, estabelecimento.getComplemento());
            stmt.setString(4, estabelecimento.getBairro());
            stmt.setString(5, estabelecimento.getCidade());
            stmt.setString(6, estabelecimento.getUf());
            stmt.setFloat(7, estabelecimento.getLatitude());            
            stmt.setFloat(8, estabelecimento.getLongitude());
            stmt.setInt(9, estabelecimento.getId());
            retorno = stmt.execute();
            stmt.close();
            retorno = true;
        } catch (SQLException ex)
                {
                    System.out.println(ex);
                    System.out.println("Não foi possível alterar o estabelecimento.");
                }        
        return retorno;
    }
}
