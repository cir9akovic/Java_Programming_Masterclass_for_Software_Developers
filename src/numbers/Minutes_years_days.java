package numbers;

import java.util.Scanner;

public class Minutes_years_days {

    public static void main(String [] args)
    {

        //  Program to convert minutes into a number of years and days

        int year_min = 525600;
        int day_min = 1440;

        System.out.println("Enter minutes: ");
        Scanner scann = new Scanner(System.in);
        int min = scann.nextInt();

        int years = min / year_min;
        int days = min % year_min / day_min;

        System.out.println("Years: " + years + " Days: " + days);
    }
}
