package udemy_exercises;

import java.util.*;

class Sorting {
    /***Sorting** 
    - **sortIntegers()**
        -  Create a Java function that sorts a list of integers in descending order
        -  getIntegers() - returns an array of entered integers from keyboard
        -  printArray() - prints out the contents of the array
        -  sortIntegers() - sort the array and return a new array containing the sorted numbers
    - **reverseArray()**
    - Write a method called reverse() that takes an integer array, and reverses it.  
        This method should not return the array.  
        It only modifies the array passed into it.  
        ***Do you think this function is pure or impure?***
    - The method should not return any value. In other words, the method is allowed to modify the array parameter.
    - In main() test the reverse() method and print the array both reversed and non- reversed.*/

    static void sortIntegers(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void printNums(int[] numArray) {
        System.out.println(Arrays.toString(numArray));
    }

    static int[] getNums() {
        System.out.println("This is the Sorting Class");
        System.out.println("Input 5 numbers");

        int[] numArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        sc.close();
        return numArray;
    }

    static void reverse(int[] numbers) {
        Arrays.sort(numbers);
        int[] reverseArray = new int[numbers.length];
        int counter = 0;
        for (int j = numbers.length - 1; j >= 0; j--) {
            reverseArray[counter] = numbers[j];
            counter++;
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    public static void main(String[] args) {
        int[] newArray = getNums();

        System.out.println("Your Numbers are:");
        printNums(newArray);

        System.out.println("Your Numbers sorted are:");
        sortIntegers(newArray);

        System.out.println("Your Numbers sorted in reverse are:");
        reverse(newArray);

    }

}
