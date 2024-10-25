// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Taxes {
    public static void main(String[] var0) {
        System.out.println("enter number: ");
        Scanner var1 = new Scanner(System.in);
        double var2 = var1.nextDouble();

        System.out.print("TAX BILL: You must pay \u00A3");

        double taxes;

        if (var2 >= 45000) {
            taxes = var2 * 0.25;
        } else if (var2 >= 30000) {
            taxes = var2 * 0.2;
        } else if (var2 >= 20000) {
            taxes = var2 * 0.15;
        } else if (var2 >= 15000) {
            taxes = var2 * 0.1;
        } else {
            taxes = 0;
        }
        System.out.println(taxes);
    }
}