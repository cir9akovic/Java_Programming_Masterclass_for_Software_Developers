package numbers;

import java.util.Scanner;

public class Distance_time_speed {

    public static void main(String [] args)
    {

        /* Distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
           and display the speed, in meters per second, kilometers per hour and miles per hour
        */

        Scanner scann = new Scanner(System.in);
        System.out.println("Insert distance(in meters): ");
        float meters = scann.nextFloat();
        System.out.println("Insert hours: ");
        float hours = scann.nextFloat();
        System.out.println("Insert minutes: ");
        float minutes = scann.nextFloat();
        System.out.println("Insert seconds");
        float seconds = scann.nextFloat();

        float distance_seconds = (hours*60 + minutes)*60 + seconds;

        float m_s = meters/distance_seconds;
        float k_h = (meters/1000.0f) / (distance_seconds/3600.0f);
        float m_h = k_h/1609f;

        System.out.println("Speed m/s: " + m_s);
        System.out.println("Speed km/h: " + k_h);
        System.out.println("Speed mile/h: " + m_h);
    }
}
