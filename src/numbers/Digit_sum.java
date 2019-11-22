package numbers;

import java.util.Scanner;

public class Digit_sum {

    public static void main(String [] args)
    {

        // Program that reads an integer between 0 and 1000 and adds all the digits in the integer

        int sum = 0;

        System.out.println("Enter digit: ");
        Scanner scann = new Scanner(System.in);
        int digit = scann.nextInt();

        while (digit != 0) {
            sum += digit % 10;;
            digit /= 10;
        }

        System.out.println("Sum is: " + sum);
    }
}
