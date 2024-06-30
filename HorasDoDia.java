import java.util.Scanner;


public class HorasDoDia   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida.");
            sc.close();
            return;
        }
         else if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
