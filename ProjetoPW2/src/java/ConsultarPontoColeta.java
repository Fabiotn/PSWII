
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

public class ConsultarPontoColeta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            // Recebe campos do FORMULÁRIO
            int sId = Integer.parseInt(request.getParameter("sIdForm"));
                    
            // Criação da Sessão
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            // Criação do OBJETO Produto
            PontoColeta pColeta;
            pColeta = (PontoColeta) sessao.get(PontoColeta.class,sId);
            
            // Mensagem para resultado da pesquisa
            String mensagem = "Ponto de Coleta localizado com sucesso!";
            if (pColeta == null) {
                mensagem = "Ponto de Coleta não localizado";
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Web II</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + mensagem + "</h1>");
            out.println("<p> Id: " + pColeta.getId() + "</p>");            
            out.println("<p> Nome " + pColeta.getNome() + "</p>");
            out.println("<p> Nome Abreviado: " + pColeta.getNomeAbrv() + "</p>");
            out.println("<p> Endereço Físico: " + pColeta.getEndereco() + "</p>");
            out.println("<p> Endereço Lógico: " + pColeta.getEnderecoLgc() + "</p>");
            out.println("<p> Latitude: " + pColeta.getLatitude() + "</p>");            
            out.println("<p> Longitude: " + pColeta.getLongitude() + "</p>");            
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
