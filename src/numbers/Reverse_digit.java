package numbers;

import java.util.Scanner;

public class Reverse_digit {

    public static void main(String [] args)
    {

        // Program that reads an integer between 0 and 1000 and return reversed number

        int reverse = 0;

        System.out.println("Enter digit: ");
        Scanner scann = new Scanner(System.in);
        int digit = scann.nextInt();

        while (digit != 0){
            reverse = reverse * 10 + digit % 10;
            digit /= 10;
        }

        System.out.println("Reversed digit is: " + reverse);

    }
}
