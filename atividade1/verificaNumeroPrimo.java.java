import java.util.Scanner;

public class verificaNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int resultado = NumeroPrimo(numero);
        if (resultado == 1) {
            System.out.println(numero + " é primo.");
            scanner.close();
        } else {
            System.out.println(numero + " não é primo.");
            scanner.close();
        }
    }

    public static int NumeroPrimo(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

}
