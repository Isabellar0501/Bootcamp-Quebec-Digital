import java.util.Scanner;

public class Problem {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0;
        while (leitor.hasNext()) total += calcularValor();
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }

    static double calcularValor() {
        int codigo = leitor.nextInt();
        return leitor.nextInt() * leitor.nextDouble();
    }
}