package exercise2;

import java.util.*;

class Array {

    //Take the arrays.js file, and refactor the code into Java in this file.
    private static int[] nums = { 10, 23, 3, 4, 5, 2, 1 };
    private static String[] greetings = { "hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا" };
    private static boolean[] binaries = { false, true, true, true, false, false, false, true, true, true, true, true,
            false, true, false, false, true, false };

    public static void printNums() {
        System.out.println(Arrays.toString(nums));
    };

    public static void printGreetings() {
        System.out.println(Arrays.toString(greetings));

    };

    public static void printBinaries() {
        System.out.println(Arrays.toString(binaries));

    };

    public static void main(String[] args) {
        Array.printNums();
        Array.printBinaries();
        Array.printGreetings();
    }
}
