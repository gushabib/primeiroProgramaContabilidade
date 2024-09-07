import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Transacao {
    protected String descricao;
    protected BigDecimal valor;
    protected LocalDateTime data;

    public Transacao(String descricao, BigDecimal valor, LocalDateTime data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public abstract void exibirDetalhes();

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
