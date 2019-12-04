package arrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrayInt = getIntegers(5);
        for(int i=0; i<arrayInt.length; i++){
            System.out.println("Element " + i + " typed value was " + arrayInt[i]);
        }

        System.out.println("The avrage is " + getAvrage(arrayInt));
    }

    private static int[] getIntegers(int number){

        System.out.println("Enter " + number + " integer values.\r");

        int[] myArray = new int[number];
        for(int i=0; i<myArray.length; i++){
            myArray[i] = scan.nextInt();
        }

        scan.close();

        return myArray;
    }

    private static double getAvrage(int[] array){

        // Copy array
        // int[] arrayCopy1 = Arrays.copyOf(array, array.length);
        int[] arrayCopy = new int[array.length];
        for (int i=0; i<array.length; i++){
            arrayCopy[i] = array[i];
        }

        int sum = 0;
        for(int i=0; i<arrayCopy.length; i++){
            sum += arrayCopy[i];
        }

        return (double) sum / arrayCopy.length;
    }
}
