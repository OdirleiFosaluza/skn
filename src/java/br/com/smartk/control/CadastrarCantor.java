/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartk.control;

import br.com.smartk.model.Cantor;
import br.com.smartk.model.CantorDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Odirlei
 */
public class CadastrarCantor extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                   
        String gravar = request.getParameter("gravar");
        String alterar = request.getParameter("alterar");        
        String excluir = request.getParameter("excluir");                   
            
        //pegando os parametros  
        if(gravar !=null)
        {
            String nome = request.getParameter("nome");            
            Cantor cantor = new Cantor();
            cantor.setNome(nome);
            CantorDao dao = new CantorDao();
            Boolean retorno =  dao.incluirCantor(cantor); 
            if(retorno.equals(true))
            {    
                RequestDispatcher rd = request.getRequestDispatcher("/ConfirmarCantor.jsp");
                rd.forward(request,response);
            }else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
                rd.forward(request,response);
            }
        }            
            
        if(excluir != null)
        {
            Cantor cantor = new Cantor();            
            CantorDao dao = new CantorDao();
            cantor.setId(Integer.parseInt(request.getParameter("id")));
            //usuario.setId(4);
            Boolean retorno =  dao.excluirCantor(cantor);
            if(retorno.equals(true))
            {    
                RequestDispatcher rd = request.getRequestDispatcher("/ListaCantor.jsp");
                rd.forward(request,response);
            }else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
                rd.forward(request,response);
            }
        }
        if(alterar !=null)
        {
            Integer id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");            
            Cantor cantor = new Cantor();
            cantor.setId(id);
            cantor.setNome(nome);
            CantorDao dao = new CantorDao();
            Boolean retorno =  dao.alterarCantor(cantor);
            if(retorno.equals(true))
            {    
                RequestDispatcher rd = request.getRequestDispatcher("/ConfirmarCantor.jsp");
                rd.forward(request,response);
            }else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
                rd.forward(request,response);
            }
        }     
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
