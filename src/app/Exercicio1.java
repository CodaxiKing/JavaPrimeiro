package app;

public class Exercicio1 {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which prince is $ %.2f", product1, price1);
        System.out.printf("%s, which prince is $ %.2f", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
        System.out.printf("Measue witch eight decimal places: %.8f", measure);
        System.out.printf("Rouded (three decimal places: %.3f", measure);
        System.out.printf("US decimal point: %.3f", measure);
    }

}
