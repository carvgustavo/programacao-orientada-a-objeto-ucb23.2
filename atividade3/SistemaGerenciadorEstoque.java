import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGerenciadorEstoque {
    private ArrayList<Produto> estoque;

    public SistemaGerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        Produto novoProduto = new Produto(nome, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equals(nome)) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void listarProdutos() {
        if (estoque.size() == 0) {
            System.out.println("Não há produtos cadastrados no estoque.");
            return;
        }
        System.out.println("Produtos cadastrados no estoque:");
        for (Produto produto : estoque) {
            System.out.println(produto.getNome() + " - " + produto.getQuantidade());
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Produto produto : estoque) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public static void main(String[] args) {
        SistemaGerenciadorEstoque gerenciador = new SistemaGerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Atualizar quantidade");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarProduto(nome, quantidade);
                    break;
                case 2:
                    System.out.println("\nDigite o nome do produto que deseja remover:");
                    nome = scanner.nextLine();
                    gerenciador.removerProduto(nome);
                    break;
                case 3:
                    gerenciador.listarProdutos();
                    break;
                case 4:
                    System.out.println("\nDigite o nome do produto que deseja atualizar a quantidade:");
                    nome = scanner.nextLine();
                    System.out.println("Digite a nova quantidade do produto:");
                    quantidade = scanner.nextInt();
                    gerenciador.atualizarQuantidade(nome, quantidade);
                    break;
                case 5:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
System.out.println("\nOpção inválida.");
                    break;
            }
        }
    }
}
