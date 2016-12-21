package br.com.smartk.control;

import br.com.smartk.model.Genero;
import br.com.smartk.model.GeneroDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Odirlei
 */
public class IncluirGenero extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        Boolean retorno;
        Genero genero   =   new Genero();
        GeneroDao dao   =   new GeneroDao();
        String nome = request.getParameter("nome");
        genero.setNome(nome);
        System.out.println("Nome" + genero.getNome() + nome + "...");
        retorno = dao.adicionarGenero(genero);
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet IncluirGenero</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + "Generico? " + retorno + genero.getNome()+ "</h1>");        
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        /*
        Boolean retorno;
        Genero genero   =   new Genero();
        GeneroDao dao   =   new GeneroDao();
        String nome = request.getParameter("nome");
        String nomes = request.getParameter("nomes");
        genero.setNome(nome);
        System.out.println(genero.getNome() +"..."+ nome + "-" + nomes);
        retorno = dao.adicionarGenero(genero);
        */
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet IncluirGenero</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>GET</h1>");
        out.println("</body>");
        out.println("</html>");

    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
