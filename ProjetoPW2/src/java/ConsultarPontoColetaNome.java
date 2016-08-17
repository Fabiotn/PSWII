
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class ConsultarPontoColetaNome extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            // Recebe campos do FORMULÁRIO
            String sNomePontoColeta = request.getParameter("sNomePontoColetaForm");
                    
            // Criação da Sessão
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            // Criação do OBJETO Criteria
            Criteria criteria = sessao.createCriteria(PontoColeta.class);
            criteria.add(Restrictions.eq("nome", sNomePontoColeta));
            
            List <PontoColeta> resultado = criteria.list();
            
            // Mensagem para resultado da pesquisa
            String mensagem = "Ponto de Coleta localizado com sucesso!";
            if (resultado == null) {
                mensagem = "Ponto de Coleta não localizado";
            }            
            
            // Apresentação do resultado
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultarPontoColetaNome</title>");            
            out.println("</head>");
            out.println("<body>");            
            
            for (PontoColeta pc : resultado) {
                out.println("<h1> Ponto de Coleta Encontrado: </h1>");
                out.println("  Id: " + pc.getId() + "</br>");
                out.println("  Nome: " + pc.getNome() + "</br>");
                out.println("  Endereço: " + pc.getEndereco() + "</br>");        
            }

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
