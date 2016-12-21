/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartk.control;

import br.com.smartk.model.Estabelecimento;
import br.com.smartk.model.EstabelecimentoDao;
import br.com.smartk.model.Usuario;
import br.com.smartk.model.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Odirlei
 */
public class CadastrarEstabelecimento extends HttpServlet {

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
        PrintWriter out = response.getWriter();
                   
        String gravar = request.getParameter("gravar");
        String alterar = request.getParameter("alterar");        
        String excluir = request.getParameter("excluir");
        
        if(gravar != null){
            Estabelecimento estabelecimento = new Estabelecimento();            
            EstabelecimentoDao dao = new EstabelecimentoDao();
            ValidarCadastros validar = new ValidarCadastros();
            Boolean retorno;                                                                                                    
            estabelecimento.setNome(request.getParameter("nome"));
            estabelecimento.setEndereco(request.getParameter("endereco"));
            estabelecimento.setComplemento(request.getParameter("complemento"));
            estabelecimento.setBairro(request.getParameter("bairro"));            
            estabelecimento.setCidade(request.getParameter("cidade"));
            estabelecimento.setUf(request.getParameter("uf"));            
            Float latitude = Float.parseFloat(request.getParameter("latitude"));
            estabelecimento.setLatitude(latitude);
            Float longitude = Float.parseFloat(request.getParameter("longitude"));
            estabelecimento.setLongitude(longitude);                   
            String mensagem =  validar.validarEstabelecimento(estabelecimento);            
            if(mensagem.equals("valido"))
            {
                retorno = dao.incluirEstabelecimento(estabelecimento);             
                if(retorno.equals(true)){ 
                    RequestDispatcher rd = request.getRequestDispatcher("ConfirmarEstabelecimento.jsp");
                    rd.forward(request, response);                   
                }else
                {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }     
            }else
            {
                RequestDispatcher rd = request.getRequestDispatcher("Estabelecimento.jsp?mensagem=mensagem");
                rd.forward(request, response);                   
            }
                
        }       
        
        if(alterar != null)
        {
           Estabelecimento estabelecimento = new Estabelecimento();            
            EstabelecimentoDao dao = new EstabelecimentoDao();
            Boolean retorno;        
            Integer id = Integer.parseInt(request.getParameter("id"));
            estabelecimento.setId(id);
            estabelecimento.setNome(request.getParameter("nome"));
            estabelecimento.setEndereco(request.getParameter("endereco"));
            estabelecimento.setComplemento(request.getParameter("complemento"));
            estabelecimento.setBairro(request.getParameter("bairro"));            
            estabelecimento.setCidade(request.getParameter("cidade"));
            estabelecimento.setUf(request.getParameter("uf"));
            Float latitude = Float.parseFloat(request.getParameter("latitude"));
            estabelecimento.setLatitude(latitude);
            Float longitude = Float.parseFloat(request.getParameter("longitude"));
            estabelecimento.setLongitude(longitude);            
            retorno = dao.alterarEstabelecimento(estabelecimento);
            if(retorno.equals(true)){ 
                RequestDispatcher rd = request.getRequestDispatcher("ConfirmarEstabelecimento.jsp");
                rd.forward(request, response);                   
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                rd.forward(request, response);
            }        
        }
        
        if(excluir != null)
        {
            Estabelecimento estabelecimento = new Estabelecimento();            
            EstabelecimentoDao dao = new EstabelecimentoDao();
            Integer id = Integer.parseInt(request.getParameter("id"));
            estabelecimento.setId(id);            
            Boolean retorno =  dao.excluirEstabelecimento(estabelecimento);
            if(retorno.equals(true))
            {    
                RequestDispatcher rd = request.getRequestDispatcher("/ListaEstabelecimento.jsp");
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
