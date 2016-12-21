package br.com.smartk.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Odirlei
 */
public class UsuarioDao {

    Connection conexao;
    
    public UsuarioDao(){
        this.conexao = new Conexao().getConnection();
    }
    
    public Boolean incluirUsuario(Usuario usuario){
        Integer id = buscarId();
        String sql = "insert into usuario"+
                        "(id_usuario, email_usuario, celular_usuario, senha_usuario, login_usuario, nome_usuario, sobrenome_usuario, uf_usuario, cidade_usuario, facebook_usuario, data_nascimento_usuario )"+
                        "values(?,?,?,?,?,?,?,?,?,?,?)";
        //dataNascimento_usuario,
        Boolean gravado=false;
        
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {     
            stmt.setInt(1, id);
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCelular());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getNome());
            stmt.setString(7, usuario.getSobrenome());            
            stmt.setString(8, usuario.getUf());
            stmt.setString(9, usuario.getCidade());
            stmt.setString(10, usuario.getFacebook()); 
            //java.sql.Date dataSql = new java.sql.Date(dataf.getTime());
            //Calendar dataCalendar = Calendar.getInstance();
            //Date dataSql = new Date(dataCalendar.getTimeInMillis());
            /*
            Calendar dataCalendar = Calendar.getInstance();

            Date dataSQL = new Date(dataCalendar.getTimeInMillis()); // este objeto Date é do pacote java.sql.
            */
            java.sql.Date dataSql = new java.sql.Date(usuario.getDataNascimento().getTime());
            stmt.setDate(11, dataSql);                        
            gravado = stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não gravou o cantor");
        } 
        
        
        return gravado;
    }
    public Boolean validarLogin(String login, String senha)
    {
        Boolean autorizado;
        List<Usuario> lista = new ArrayList<Usuario>();
        UsuarioDao dao = new UsuarioDao();
        lista = dao.getLista();
        for (Usuario usu : lista)
        {            
            if (usu.getLogin().equals(login))
            {
                if (usu.getSenha().equals(senha))
                {
                    return autorizado = true;
                }
            }              
        }
        return autorizado = false;
    }
    public List<Usuario> getLista(){
        String sql = "Select * from usuario";        
        List<Usuario> lista = new ArrayList<Usuario>();
        try 
        {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setLogin(rs.getString("login_usuario"));
                usuario.setSenha(rs.getString("senha_usuario"));
                usuario.setEmail(rs.getString("email_usuario"));
                usuario.setCelular(rs.getString("celular_usuario"));
                usuario.setNome(rs.getString("nome_usuario"));
                usuario.setSobrenome(rs.getString("sobrenome_usuario"));
                usuario.setDataNascimento(rs.getDate("data_nascimento_usuario"));
                usuario.setUf(rs.getString("uf_usuario"));
                usuario.setCidade(rs.getString("cidade_usuario"));
                usuario.setFacebook(rs.getString("facebook_usuario"));                
                lista.add(usuario);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Boolean alterarUsuario(Usuario usuario)
    {
        Boolean retorno; 
        
        String sql = "update usuario set email_usuario=?, celular_usuario=?, nome_usuario=?, sobrenome_usuario=?, uf_usuario=?, cidade_usuario=?, data_nascimento_usuario=? where login_usuario=?";  
        
        //String sql = "update usuario set email_usuario = ? where login_usuario=?" ;
                try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
                {                   
                    stmt.setString(1, usuario.getEmail());
                    stmt.setString(2, usuario.getLogin());
                    stmt.setString(1, usuario.getEmail());
                    stmt.setString(2, usuario.getCelular());
                    stmt.setString(3, usuario.getNome());
                    stmt.setString(4, usuario.getSobrenome() );
                    stmt.setString(5, usuario.getUf());
                    stmt.setString(6, usuario.getCidade());
                    java.sql.Date dataSql = new java.sql.Date(usuario.getDataNascimento().getTime());
                    stmt.setDate(7, dataSql); 
                    stmt.setString(8, usuario.getLogin());
                    retorno = stmt.execute();
                    stmt.close();
                    return retorno = true;
                } catch (SQLException ex) {
                    Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Não alterou usuário");
                } 
        return retorno = false;
    }
    public Integer buscarId()
    {        
        List<Usuario> lista = new ArrayList<Usuario>();
        UsuarioDao dao = new UsuarioDao();
        Integer maior = 0;
        Integer menor = 0;
        lista = dao.getLista();
        for (Usuario usu : lista)
        {      
            menor = usu.getId();
            if(maior < menor)
            {
                maior = menor;
            }
        }
        return maior + 1;
    }
    public Boolean excluirUsuario(Usuario usuario)
    {
        Boolean retorno; 
        
        String sql = "delete from usuario where id_usuario=?";  
        
        //String sql = "update usuario set email_usuario = ? where login_usuario=?" ;
                try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
                {                   
                    stmt.setInt(1, usuario.getId());                  
                    retorno = stmt.execute();
                    stmt.close();
                    return retorno = true;
                } catch (SQLException ex) {
                    Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Não alterou usuário");
                } 
        return retorno = false;
    }
}

