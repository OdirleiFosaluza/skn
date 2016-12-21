
package br.com.smartk.control;

import br.com.smartk.model.Cantor;
import br.com.smartk.model.Genero;
import br.com.smartk.model.Musica;
import br.com.smartk.model.MusicaDao;
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
public class CadastrarMusica extends HttpServlet {

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
        //try (PrintWriter out = response.getWriter()) {
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastrarMusica</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Não</h1>");
            out.println("</body>");
            out.println("</html>");
            */        
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
        Musica musica = new Musica();
        MusicaDao dao = new MusicaDao();
        Cantor cantor = new Cantor();
        Genero genero = new Genero();
        Boolean retorno; 
        PrintWriter out = response.getWriter();
        musica.setId(Integer.parseInt(request.getParameter("id")));
        musica.setNome(request.getParameter("nome"));
        musica.setInicio(request.getParameter("inicio"));
        musica.setCodigo(request.getParameter("codigo"));
        musica.setIdioma(request.getParameter("idioma"));
        cantor.setId(Integer.parseInt(request.getParameter("cantor")));
        genero.setId(Integer.parseInt(request.getParameter("genero")));
        musica.setIdCantor(cantor);
        musica.setIdGenero(genero);
        //musica.setId(Integer.parseInt(request.getParameter("cantor")));
        //musica.setId(Integer.parseInt(request.getParameter("genero")));
        retorno = dao.incluirMusica(musica);
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet CadastrarMusica</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Id"+ musica.getId()+ "</h1>");
        out.println("<h1>Nome "+ musica.getNome()+ "</h1>");
        out.println("<h1>Idioma "+ musica.getIdioma()+ "</h1>");
        out.println("<h1>inicio "+ musica.getInicio()+ "</h1>");
        out.println("<h1>Código "+ musica.getCodigo()+ "</h1>");
        //out.println("<h1>Cantor"+ musica+ "</h1>");
        //out.println("<h1>Cantor"+ musica.getIdCantor()+ "</h1>");
        //out.println("<h1>Genero"+ musica.getIdGenero()+ "</h1>");
        out.println("</body>");
        out.println("</html>");
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
