import java.util.Scanner;

public class Exercicio1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float n1, n2, resultado;
        char operacao;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextFloat();

        System.out.println("Digite o segundo número: ");
        n2 = input.nextFloat();

        System.out.println("Informe a operação com o sinal (+, -, *, /): ");
        operacao = input.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':    
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case '/':    
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
                break;

            default:
                break;
        }
    }

}