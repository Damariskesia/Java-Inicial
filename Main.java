public class Main      {

    public static void main(String[] args) {
        double x = 10.35784;
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        int a,b;
        double resultado;

        a=5;
        b=2;

        resultado = (double) a / b;

        System.out.println("Hello, World!");
        System.out.println(x);
        System.out.printf("%.4f%n", x);
        System.out.printf("Resultado = %.2f metros%n", x);

        System.out.printf("Product: %s, which price is $ %.2f%n", product1, price1);
        System.out.printf(" %s, which price is $ %.2f%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code,gender);

        System.out.println(resultado);
    }
}