
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PedidoSpoletoIngredientes extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            // Recebe campos do FORMULÁRIO
            String [] itens = request.getParameterValues("itensIngred");
            
            //Avalia quantidade de pedidos em relação ao perfil do usuário
            String mensagem;
            if (itens.length > 5 && request.isUserInRole("ESPECIAL")) {
                mensagem = "Mensagem: Seu perfil ESPECIAL limita sua escolha a no máximo 5 ingredientes!";
                itens = null;
            } else if (itens.length > 10 && request.isUserInRole("PREMIUM")) {
                mensagem = "Mensagem: Seu perfil PREMIUM limita sua escolha a no máximo 10 ingredientes!";
                itens = null;
            } else if (itens.length > 0 && request.isUserInRole("COMUM")) {
                mensagem = "Mensagem: Seu perfil COMUM não lhe permite personalizar os ingredientes, será servido a moda da casa!";
                itens = null;
            } else {
                mensagem = null;
            }
                       
            // Recupera uma Sessão existente
            HttpSession sessao = request.getSession(false);
            
            if (sessao != null) {
                // Recuperação de variável na sessão
                PedidoSpolleto p = (PedidoSpolleto) sessao.getAttribute("Pedido");
                
                // Atualiza o Pedido (se não existir mensagem) e Mensagem, 
                if (itens != null) {
                    List <String> ingredientes = Arrays.asList(itens);
                    p.setIngredientes(ingredientes);
                }
                p.setMensResultPedido(mensagem);
            }
            
            // Aciona pagina JSP - Formulário de Edição
            request.getRequestDispatcher("PedidoSpolleto.jsp").forward(request, response);               
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
