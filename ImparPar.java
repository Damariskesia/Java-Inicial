import java.util.Scanner;

public class ImparPar  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o Seu Nome?");
        String nome = sc.next();

        System.out.println("Qual a primeira letra do seu sobrenome?");
        char letra = Character.toUpperCase(sc.next().charAt(0));

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("Nome: %s. Sobrenome: %s O número é par.", nome, letra);
        } else {
            System.out.printf("%s %s. O número é ímpar.",nome,letra);
        }

        sc.close();
    }
}
