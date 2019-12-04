package arrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseChallenge {

    private  static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = createArray();
        int[] reverseArray = reverse(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(reverseArray));
    }

    private static int[] reverse(int[] array){

        int[] reversedArray = new int[array.length];
        int t=0;
        for(int i = array.length - 1; i >= 0; i--){
            reversedArray[t] = array[i];
            t++;
        }

        return reversedArray;
    }

    private static int[] createArray(){

        System.out.println("Enter length of a array: ");

        int count = scan.nextInt();
        scan.nextLine();

        int[] myArray = new int[count];

        System.out.println("Enter elements of a array: ");
        for(int i=0; i<myArray.length; i++){
            myArray[i] = scan.nextInt();
            scan.nextLine();
        }

        scan.close();

        return myArray;
    }

}
