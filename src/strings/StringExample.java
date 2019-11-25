package strings;

public class StringExample   {

    public static void main(String[] args) {

        String oneString = "This is ";
        String twoString = "my string";

        System.out.println("Example of string");
        System.out.println(oneString + "first example");
        System.out.println(oneString + twoString);

        System.out.println("Unicode: " + "\u009A");

        // Java numberString like a String
        String numberString = "255.55";
        numberString = numberString + "233";
        System.out.println(numberString);

        // Java numbers transform into String
        String lastString = "10";
        int myint = 50;
        lastString = lastString + myint;
        System.out.println(lastString);
    }
}
