import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 

        float temp, resultado;
        char opção;

        System.out.println("Informe a temperatura: ");
        temp = input.nextFloat();

        System.out.println("Informe a conversão (C de Celsius para Fahrenheit ou F de Fahrenheit para Celsius): ");
        opção = input.next().charAt(0);

        switch (opção) {
            case 'C':
            case 'c':
                resultado = (float) ((temp * 1.8) + 32);
                System.out.println("Temperatura em Fahrenheint: " + resultado);
                break;

            case 'F':
            case 'f': 
                resultado = (float) ((temp - 32) / 1.8);
                System.out.println("Temperatura em Celsius: " + resultado);
                break;

            default:
                System.out.println("Caractere inválido");
                break;
        }
    }
}
