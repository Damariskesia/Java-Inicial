import java.util.Scanner;

public class SomaWhile   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            System.out.println("Digite outro número: ");
            x = sc.nextInt();
        }
    System.out.println(soma);

    sc.close();
    }
}
