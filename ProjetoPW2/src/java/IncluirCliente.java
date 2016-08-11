/*
Realizar inclusão de cliente utilizando o BEAN: Cliente.java
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class IncluirCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            // Recebe campos do FORMULÁRIO
            String sNome = request.getParameter("sNomeForm");
            String sEndereco = request.getParameter("sEnderecoForm");
            String sCpf = request.getParameter("sCpfForm");
            
            // Criação da Sessão
            Session sessao = HibernateUtil.getSessionFactory().openSession();            
            // Criação da Transação
            Transaction trn = sessao.beginTransaction(); 
            
            // Criação do OBJETO e atribuir conteúdo dos atributos
            Cliente cli = new Cliente();
            cli.setNome(sNome);
            cli.setEndereco(sEndereco);
            cli.setCpf(sCpf);
            
            // Execução dos verbos do HIBERNATE
            sessao.save(cli);
            // Descarga no HIBERNATE
            sessao.flush();
            // Commit
            trn.commit();
            // Encerra a Sessão
            sessao.close();          
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Web II</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Cliente Incluído com SUCESSO !!! </h1>");
            out.println("</body>");
            out.println("</html>");
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
