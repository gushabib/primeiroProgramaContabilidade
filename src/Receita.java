import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Receita extends Transacao {

    private String fonte;

    public Receita(String descricao, BigDecimal valor, LocalDateTime data, String fonte) {
        super(descricao, valor, data);
        this.fonte = fonte;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Despesa:");
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Data: " + getData());
        System.out.println("Categoria: " + getFonte());
        System.out.println();
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}
