import java.util.List;
import java.util.Scanner;
import DAO.roupaDAO;
import lojaderoupas.roupa;

public class Executavel {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        roupaDAO dao = new roupaDAO();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                roupa r = new roupa();
                System.out.println("Digite o código da roupa:");
                r.setCodigo(scanner.nextInt());
                scanner.nextLine(); 
                System.out.println("Digite a descrição da roupa:");
                r.setDescricao(scanner.nextLine());
                System.out.println("Digite o preço da roupa:");
                r.setPreco(scanner.nextLine());
                System.out.println("Digite o tamanho da roupa:");
                r.setTamanho(scanner.nextLine());
                dao.cadastrarRoupa(r);
            } else if (opcao == 2) {
                List<roupa> roupas = dao.consultarRoupas();
                for (roupa r : roupas) {
                    System.out.println("Código: " + r.getCodigo());
                    System.out.println("Descrição: " + r.getDescricao());
                    System.out.println("Preço: " + r.getPreco());
                    System.out.println("Tamanho: " + r.getTamanho());
                    System.out.println("------------------------");
                }
            } else if (opcao == 3) {
                roupa r = new roupa();
                System.out.println("Digite o código da roupa que deseja atualizar:");
                r.setCodigo(scanner.nextInt());
                scanner.nextLine(); 
                System.out.println("Digite a nova descrição da roupa:");
                r.setDescricao(scanner.nextLine());
                System.out.println("Digite o novo preço da roupa:");
                r.setPreco(scanner.nextLine());
                System.out.println("Digite o novo tamanho da roupa:");
                r.setTamanho(scanner.nextLine());
                dao.atualizarRoupa(r);
                System.out.println("Roupa atualizada com sucesso!");
                dao.atualizarRoupa(r);
            } else if (opcao == 4) {
                System.out.println("Digite o código da roupa que deseja excluir:");
                int codigo = scanner.nextInt();
                dao.excluirRoupa(codigo);
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                scanner.close();
                System.exit(0);
            }
        }
    }
}