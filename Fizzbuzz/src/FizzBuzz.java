package Fizzbuzz.src;
import java.util.Scanner;

public class FizzBuzz {




    public static void main(String[] args) {
        System.out.println("enter number: ");

        //max value
        Scanner input = new Scanner(System.in);

        int max = input.nextInt();

        for(int i = 1; i <= max; i ++){

            if ( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Buzz");

            } else if(i % 5 == 0){
                System.out.println("Fizz");

            }else{
                System.out.println(i);
            }


        }


    }
}