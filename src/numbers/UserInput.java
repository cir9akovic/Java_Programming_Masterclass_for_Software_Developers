package numbers;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("Enter your year of birth: ");

        int yearOfBirth = scan.nextInt();
        // After nextInt scanner end the line, and we cant enter hometown. We need to add line with
        scan.nextLine();
        int age = 2019 - yearOfBirth;

        System.out.println("Enter your hometown: ");

        String hometown = scan.nextLine();

        System.out.println("Your name is " + name + " a your age is " + age + " and you live in " + hometown);

        // When we done with Scanner, we close him because of memory
        scan.close();
    }
}
