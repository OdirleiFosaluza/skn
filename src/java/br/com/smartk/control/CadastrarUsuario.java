
package br.com.smartk.control;

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
import javax.swing.JOptionPane;

/**
 *
 * @author Odirlei
 */
public class CadastrarUsuario extends HttpServlet {

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
           
        String validar = request.getParameter("validar");
        String gravar = request.getParameter("gravar");
        String alterar = request.getParameter("alterar");
        String buscar = request.getParameter("buscar");
        String excluir = request.getParameter("excluir");
        if(gravar != null){
            Usuario usuario = new Usuario();
            UsuarioDao dao  = new UsuarioDao();
            Boolean retorno;        
            String confirmarSenha = request.getParameter("confirmarsenha");  
            String dataEmTexto;
            Calendar dataNascimento;
            if (confirmarSenha.equals(request.getParameter("senha")))
            {
                //usuario.setId(Integer.parseInt(request.getParameter("id")));
                usuario.setNome(request.getParameter("nome"));
                usuario.setSobrenome(request.getParameter("sobrenome"));
                usuario.setEmail(request.getParameter("email"));
                usuario.setCelular(request.getParameter("celular"));
                usuario.setCidade(request.getParameter("cidade"));
                usuario.setUf(request.getParameter("uf"));
                usuario.setLogin(request.getParameter("login"));                        
                usuario.setSenha(request.getParameter("senha"));
                dataEmTexto = request.getParameter("datanascimento");
                try{
                    SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                    Date data = formatar.parse(dataEmTexto);
                    //String data2 = formatar.format(data);
                    usuario.setDataNascimento(data);
                    retorno = dao.incluirUsuario(usuario); 
                    if(retorno.equals(false))
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("Sucesso.jsp");
                        rd.forward(request, response);                                   
                    }else
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                        rd.forward(request, response);                                   
                    }               
                    }catch (java.text.ParseException e){
                            System.out.println("Erro de conversão de data");			
                    }

            }else
            {
                RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                rd.forward(request, response);
            }
        }
        if(validar != null)
        {
            Boolean autorizado;
            UsuarioDao dao = new UsuarioDao();
            String senha = request.getParameter("senha");
            String login = request.getParameter("login");
            autorizado = dao.validarLogin(login, senha);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastrarUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Generico " + autorizado + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        if(alterar != null)
        {
            Boolean retorno;
            Usuario usuario = new Usuario();
            UsuarioDao dao = new UsuarioDao();
            usuario.setEmail(request.getParameter("email"));
            usuario.setNome(request.getParameter("nome"));
            usuario.setSobrenome(request.getParameter("sobrenome"));
            usuario.setCelular(request.getParameter("celular"));
            usuario.setLogin(request.getParameter("login"));
            usuario.setSenha(request.getParameter("senha"));
            String dataEmTexto = request.getParameter("datanascimento");
                try
                {
                    SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                    Date data = formatar.parse(dataEmTexto);
                    //String data2 = formatar.format(data);
                    usuario.setDataNascimento(data);
                    retorno = dao.alterarUsuario(usuario);
                    if(retorno.equals(true))
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("Sucesso.jsp");
                        rd.forward(request, response);                                   
                    }else
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                        rd.forward(request, response);                                   
                    }
                        
                }catch (java.text.ParseException e){
                        System.out.println("Erro de conversão de data");			
                }
        }
        if(buscar != null)
        {
            UsuarioDao dao = new UsuarioDao();
            Integer id = dao.buscarId();
            out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>CadastrarUsuario</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Get Id " + id.toString() + "..." +"</h1>");
                    out.println("</body>");
                    out.println("</html>");                                    
        }
        if(excluir != null)
        {
            Usuario usuario = new Usuario();            
            UsuarioDao dao = new UsuarioDao();
            usuario.setId(Integer.parseInt(request.getParameter("id")));
            //usuario.setId(4);
            Boolean retorno =  dao.excluirUsuario(usuario);
            if(retorno.equals(true))
            {    
                RequestDispatcher rd = request.getRequestDispatcher("/ListaUsuario.jsp");
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
