package strings;

public class StringToNumber {

    public static void main(String[] args) {

        String stringNumberInt = "243";
        String stringNumberDouble = "112.231";

        int numberInt = Integer.parseInt(stringNumberInt);
        double numberDouble = Double.parseDouble(stringNumberDouble);

        stringNumberInt += 1;
        stringNumberDouble += 1;

        System.out.println(stringNumberInt);
        System.out.println(stringNumberDouble);

        numberInt += 2;
        numberDouble += 2.4;

        System.out.println(numberInt);
        System.out.println(numberDouble);
    }
}
