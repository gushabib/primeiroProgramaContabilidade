import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Conta {

    private BigDecimal saldo;
    private List <Transacao> transacoes;

    public Conta() {
        saldo = BigDecimal.ZERO;
        transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        if(transacao instanceof Despesa && this.saldo.compareTo(transacao.getValor()) < 0) {
            throw new RuntimeException();
        }
        if (transacoes instanceof Despesa) {
            saldo = saldo.subtract(transacao.getValor());
        }
        if (transacoes instanceof Receita) {
            saldo = saldo.add(transacao.getValor());
        }
        transacoes.add(transacao);
    }

    public void exibirExtrato() {
        for (Transacao transacao : transacoes) {
            transacao.exibirDetalhes();
        }
    }

    public String getSaldo() {
        return this.saldo.toString();
    }
}
