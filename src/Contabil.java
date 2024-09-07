import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Contabil {

    private static final Conta conta = new Conta();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        do {
            try {
                exibirMenu();
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        adicionarDespesa();
                        break;
                    case 2:
                        adicionarReceita();
                        break;
                    case 3:
                        exibirExtrato();
                        break;
                    case 4:
                        exibirSaldo();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro inesperado. Tente novamente");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("1. Adicionar Despesa");
        System.out.println("2. Adicionar Receita");
        System.out.println("3. Exibir Extrato");
        System.out.println("4. Exibir Saldo");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarDespesa() {
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        String valor = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        Despesa despesa = new Despesa(descricao, new BigDecimal(valor), LocalDateTime.now(), Categoria.valueOf(categoria));
        conta.adicionarTransacao(despesa);
        System.out.println("Despesa adicionada com sucesso!");
    }

    private static void adicionarReceita() {
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        String valor = scanner.nextLine();
        System.out.print("Fonte: ");
        String fonte = scanner.nextLine();

        Receita receita = new Receita(descricao, new BigDecimal(valor), LocalDateTime.now(), fonte);
        conta.adicionarTransacao(receita);
        System.out.println("Receita adicionada com sucesso!");
    }

    private static void exibirExtrato() {
        System.out.println("Extrato:");
        conta.exibirExtrato();
    }

    private static void exibirSaldo() {
        System.out.println("Saldo Atual: R$ " + conta.getSaldo());
    }
}
