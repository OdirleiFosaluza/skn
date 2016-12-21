
package br.com.smartk.control;

import br.com.smartk.model.Cantor;
import br.com.smartk.model.CantorDao;
import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Odirlei
 */

public class IncluirCantor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            /*
            //pegando os parametros
            String nome = request.getParameter("nome");
            Cantor cantor = new Cantor();
            cantor.setNome(nome);
            CantorDao dao = new CantorDao();
            dao.incluirCantor(cantor);
            */
            out.println("<html>");
            out.println("<body>");
            //out.println("Cantor" + cantor.getNome() + " gravado com sucesso");
            out.println("Generico");
            out.println("</body>");
            out.println("</html>");
        }    
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               PrintWriter out = response.getWriter();
            
            //pegando os parametros  
            
            String nome = request.getParameter("nome");            
            Cantor cantor = new Cantor();
            cantor.setNome(nome);
            CantorDao dao = new CantorDao();
            Boolean retorno =  dao.incluirCantor(cantor); 
            RequestDispatcher rd = request.getRequestDispatcher("Sucesso.jsp");
            rd.forward(request, response);
            /*
            out.println("<html>");
            out.println("<body>");
            out.println("Get");                        
            out.println("Gravou" + cantor.getNome()+ "..." + retorno.toString());
            */
            //Escrevendo a saída 
            /*
            CantorDao dao = new CantorDao();
            //List<Cantor> cantores = dao.getLista();            
            java.util.List<Cantor> cantores = new ArrayList<Cantor>();
            cantores = dao.getLista();           
            for(Cantor cantor: cantores){                                    
            out.println("Cantor" + cantor.getId().toString() + "-" + cantor.getNome() +  " gravado com sucesso");                        
            }
            */            
    }
}
