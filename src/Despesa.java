import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Despesa extends Transacao {

    private Categoria categoria;

    public Despesa(String descricao, BigDecimal valor, LocalDateTime data, Categoria categoria) {
        super(descricao, valor, data);
        this.categoria = categoria;
    }

    public Despesa(String descricao, BigDecimal valor, LocalDateTime data) {
        super(descricao, valor, data);
        this.categoria = Categoria.OUTROS;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Despesa:");
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Data: " + getData());
        System.out.println("Categoria: " + getCategoria());
        System.out.println();
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
