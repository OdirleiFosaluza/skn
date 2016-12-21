/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartk.control;

import br.com.smartk.model.Genero;
import br.com.smartk.model.GeneroDao;
import br.com.smartk.model.Usuario;
import br.com.smartk.model.UsuarioDao;
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
public class CadastrarGenero extends HttpServlet {

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
        {        
            PrintWriter out = response.getWriter();
            String validar = request.getParameter("validar");
            String gravar = request.getParameter("gravar");
            String alterar = request.getParameter("alterar");
            String buscar = request.getParameter("buscar");
            String excluir = request.getParameter("excluir");
            if(gravar != null)
            {
                Boolean retorno;
                Genero genero   =   new Genero();
                GeneroDao dao   =   new GeneroDao();
                String nome = request.getParameter("nome");
                genero.setNome(nome);
                System.out.println("Nome" + genero.getNome() + nome + "...");
                retorno = dao.adicionarGenero(genero);                
                if(retorno.equals(false))//gravou no banco                    
                {                      
                    RequestDispatcher rd = request.getRequestDispatcher("/ConfirmarGenero.jsp");
                    rd.forward(request,response);
                }else
                {
                    RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
                    rd.forward(request,response);
                }
            }
            
            if(excluir != null)
            {
                Genero genero = new Genero();            
                GeneroDao dao = new GeneroDao();
                genero.setId(Integer.parseInt(request.getParameter("id")));
                //usuario.setId(4);
                Boolean retorno =  dao.excluirGenero(genero);
                if(retorno.equals(true))
                {    
                    RequestDispatcher rd = request.getRequestDispatcher("/ListaGenero.jsp");
                    rd.forward(request,response);
                }else
                {
                    RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
                    rd.forward(request,response);
                }        
            }
            if(alterar != null)
            {
                Genero genero = new Genero();            
                GeneroDao dao = new GeneroDao();
                Integer id = Integer.parseInt(request.getParameter("id"));
                //String idTeste = request.getParameter("id");
                //System.out.println("Teste" + idTeste);
                genero.setId(id);
                //genero.setId(1);
                genero.setNome(request.getParameter("nome"));
                Boolean retorno = dao.alterarGenero(genero);
                retorno = true;
                if(retorno.equals(true))
                {    
                    RequestDispatcher rd = request.getRequestDispatcher("/ConfirmarGenero.jsp");
                    rd.forward(request,response);
                }else
                {
                    RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
                    rd.forward(request,response);
                }                
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
