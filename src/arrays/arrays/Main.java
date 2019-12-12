package arrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrayInt = getIntegers(5);
       /* for(int i=0; i<arrayInt.length; i++){
            System.out.println("Element " + i + " typed value was " + arrayInt[i]);
        }*/
        for (int num : arrayInt) {
            System.out.println(num);
        }

        System.out.println("The avrage is " + getAvrage(arrayInt));
        System.out.println(Arrays.toString(resizeArray(arrayInt)));


        int[] arrayTest1 = {2,14,55,7,8};
        int[] arrayTest2 = {1,5,88,39,32};
        System.out.println(Arrays.toString(metgeArrays(arrayTest1, arrayTest2)));
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


    // Resizing original array
    private static int[] resizeArray(int[] myArray){

        int[] original = myArray;

        myArray = new int[10];
        for (int i=0;i<original.length; i++){
            myArray[i]= original[i];
        }

        return myArray;
    }

    // Arrays merge
    private static int[] metgeArrays(int[] array1, int[] array2){

        int arrayLength1 = array1.length;
        int arrayLength2 = array2.length;
        int newArrayLength = arrayLength1 + arrayLength2;

        int[] newArray = new int[newArrayLength];

        int count = 0;
        for(int i=0; i<array1.length; i++){
            newArray[count] = array1[i];
            count++;
        }
        for (int i=0; i<array2.length; i++){
            newArray[count] = array2[i];
            count++;
        }

        return newArray;
    }
}
