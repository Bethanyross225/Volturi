package Fizzbuzz.src;

import org.junit.Test;

public class TestFizzBuzz {
    @Before
    public static void starting_statement() {
        System.out.println("Testing for FizzBuzz");
    }

    @Test
    public static void testFizzBuzz() {
        FizzBuzz test1 = new FizzBuzz();
        String fifteen = test1.playFizzBuzz(15)[14];
        assertAll(() -> assertEquals(fifteen,"FizzBuzz"));
    }

    @Test
    public static void testFizz() {
        FizzBuzz test2 = new FizzBuzz();
<<<<<<< HEAD
        String three = test1.playFizzBuzz(3)[2];
        assertAll(() -> assertEquals(three,"Fizz"));
=======
>>>>>>> origin/Tests
    }

    @Test
    public static void testBuzz() {
        FizzBuzz test3 = new FizzBuzz();
<<<<<<< HEAD
        String five = test1.playFizzBuzz(5)[4];
        assertAll(() -> assertEquals(five,"Buzz"));
=======
>>>>>>> origin/Tests
    }

    @Test
    public static void testNegs() {
        FizzBuzz test4 = new FizzBuzz();
    }

    @Test
    public static void testZero() {
        FizzBuzz test5 = new FizzBuzz();
    }

    @after
    public static void closing_statement() {
        System.out.println("Testing complete!");
    }

}