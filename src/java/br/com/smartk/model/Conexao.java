
package br.com.smartk.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Odirlei
 */
public class Conexao {
    
    public Connection getConnection(){
        
    String drive = "com.mysql.jdbc.Driver";
    //String drive = "com.mysql.jdcb.Driver";    
    String url = "jdbc:mysql://localhost:3306/karaoke";
    //String url = "jdbc:mysql://localhost:3306/escola";
    String usuario = "root";
    String senha = "odirlei07";                   
       Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Não possível conecar no banco de dados");
        }
        return conexao;
    }
    
    
}
