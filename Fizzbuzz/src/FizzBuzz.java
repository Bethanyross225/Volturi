package Fizzbuzz.src;
import java.util.Scanner;

public class FizzBuzz {

    public playFizzBuzz (int user_input) {
        String[] outcome = new String[user_input];

        for(int i = 1; i <= user_input; i ++){

            if ( i % 3 == 0 && i % 5 == 0){
                outcome[i-1] = "FizzBuzz";
//                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                outcome[i-1] = "Fizz";
//                System.out.println("Fizz");

            } else if(i % 5 == 0){
                outcome[i-1] = "Buzz";
//                System.out.println("Buzz");

            }else{
                outcome[i-1] = i.toString();
//                System.out.println(i);
            }
    }


    public static void main(String[] args) {
        System.out.println("enter number: ");

        //max value
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();



        }


    }
}