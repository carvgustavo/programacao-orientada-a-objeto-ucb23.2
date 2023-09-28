import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.println("Digite a marca do veículo:");
                String marca = scanner.nextLine();

                System.out.println("Digite o modelo do veículo:");
                String modelo = scanner.nextLine();
                
                System.out.println("Informe o tamanho do motor em litros:");
                String motor = scanner.nextLine();

                System.out.println("Digite o ano do veículo:");
                int ano = scanner.nextInt();

                System.out.println("Digite o valor médio do veículo:");
                float valor = scanner.nextInt();
                
                System.out.println("Digite a categoria do veículo:");
                String categoria = scanner.nextLine();
                scanner.nextLine(); // Limpar o buffer

                System.out.println("Selecione o tipo de veículo:");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");

                int tipoVeiculo = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                Veiculo veiculo;

                if (tipoVeiculo == 1) {
                    veiculo = new Carro(marca, modelo, motor, ano, valor, categoria);
                } else if (tipoVeiculo == 2) {
                    veiculo = new Moto(marca, modelo, motor, ano, valor, categoria);
                } else {
                    System.out.println("Opção inválida. Veículo não cadastrado.");
                    continue;
                }

                veiculos.add(veiculo);
                System.out.println("Veículo cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Lista de veículos cadastrados:");

                for (Veiculo veiculo : veiculos) {
                    System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - " + veiculo.getMotor() + " - " + veiculo.getAno() + " - R$" + veiculo.getValor() + " - " + veiculo.getCategoria());
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
    