import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        System.out.println("Enter second number: ");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        int res;
        if (num1 > 21 && num2 > 21) {
            res = 0;
        } else if (num1 > 21) {
            res = num2;
        } else if (num2 > 21) {
            res = num1;
        } else {
            res = Math.max(num1,num2);
        }

        System.out.println("The result is " + res);
    }
}