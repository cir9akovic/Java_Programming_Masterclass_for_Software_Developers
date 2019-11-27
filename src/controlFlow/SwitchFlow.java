package controlFlow;

import java.util.Scanner;

public class SwitchFlow {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Choose number: ");
        int input = scan.nextInt();

        switch (input){
            case 1:
                System.out.println("You choose: " + input);
                break;
            case 2:
                System.out.println("You choose: " + input);
               // break;
                // Without break program will continue to the next break (case 3)
            case 3:
                System.out.println("You choose: " + input);
                break;
            case 4: case 5: case 6:
                System.out.println("You choose one of three numbers(4,5,6): " + input);
                break;
            default:
                System.out.println("You choose wrong!");
                break;
            // Without break program will stop because is last case(default)
        }
    }
}
