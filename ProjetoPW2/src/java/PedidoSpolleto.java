
import java.util.List;

public class PedidoSpolleto {
    
    private String molho;    
    private String massa;
    private List<String> ingredientes;
    private String mensResultPedido;

    public String getMensResultPedido() {
        return mensResultPedido;
    }

    public void setMensResultPedido(String mensResultPedido) {
        this.mensResultPedido = mensResultPedido;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
