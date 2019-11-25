package numbers;

import java.util.Scanner;

public class Temperature {

    public static void main(String [] args)
    {
        // Convert temperature from Fahrenheit to Celsius degree

        System.out.println("Insert temperature in Fahrenheit:");
        Scanner scann = new Scanner(System.in);
        double f = scann.nextDouble();

        int c = (int) (f - 32) * 5/9;
        System.out.println("Converted temperature is: " + c);

    }
}
