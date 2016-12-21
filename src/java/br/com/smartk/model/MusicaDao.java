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
public class MusicaDao {
    Connection conexao;
    public MusicaDao(){
        this.conexao = new Conexao().getConnection();
    }
    
    public Boolean incluirMusica(Musica musica)
    {
        //Cantor cantor = new Cantor();
        //cantor.setId();
        String sql = "insert into musica"+
                "(id_musica,nome_musica, codigo_musica, inicio_musica, idioma_musica, id_cantor, id_genero)"+
                "values(?,?,?,?,?,?,?)";               
        Boolean retorno = false;
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {                    
            stmt.setInt(1, musica.getId());
            stmt.setString(2, musica.getNome() );
            stmt.setString(3, musica.getCodigo());
            stmt.setString(4, musica.getInicio());
            stmt.setString(5, musica.getIdioma() );
            stmt.setInt(6, musica.getIdCantor().getId());
            stmt.setInt(7, musica.getIdGenero().getId());
            //stmt.setInt(6, musica.getId());
            //stmt.setInt(7, musica.getId());            
            retorno = stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não gravou o cantor");
        } 
        return retorno;
    }
    
    public Boolean alterarMusica(Musica musica){
        String sql = "update musica"+
        "set nome_musica=?, codigo_musica=?, inicio_musica+?, idioma_musica=?, id_cantor=?, id_genero=?"+                
        "where id_musica=?";
        Boolean retorno = false;
        try (PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql))
        {                    
            stmt.setString(1, musica.getNome() );
            stmt.setString(2, musica.getCodigo());
            stmt.setString(3, musica.getInicio());
            stmt.setString(4, musica.getIdioma() );
            stmt.setInt(5, musica.getId());
            stmt.setInt(6, musica.getId());            
            stmt.setInt(7, musica.getId());
            retorno = stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CantorDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não gravou o Música");
        } 
        return retorno;
    }
    public List<Musica> getLista()
    {
        //String sql = "select * from musica";
        String sql = "Select m.id_musica, m.idioma_musica, m.inicio_musica , m.nome_musica, m.id_genero, m.id_cantor, c.nome_cantor, g.nome_genero from musica m, cantor c, genero g where m.id_cantor = c.id_cantor and m.id_genero = g.id_genero";
        List<Musica> lista = new ArrayList<Musica>();
        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);            
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next())
            {
                Musica musica = new Musica();                
                Genero genero = new Genero();
                Cantor cantor = new Cantor();
                genero.setId(rs.getInt("id_genero"));    
                musica.setNomeGenero(rs.getString("nome_genero"));                
                musica.setIdGenero(genero);                
                cantor.setId(rs.getInt("id_cantor"));
                musica.setNomeCantor(rs.getString("nome_cantor"));
                musica.setIdCantor(cantor);                
                musica.setId(rs.getInt("id_musica"));                
                musica.setIdioma(rs.getString("idioma_musica"));
                musica.setInicio(rs.getString("inicio_musica"));
                musica.setNome(rs.getString("nome_musica"));
                lista.add(musica);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não conseguiu buscar musicas");
        }
        return lista;
    }
}
