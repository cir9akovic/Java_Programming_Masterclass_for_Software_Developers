package numbers;

public class Operations {

    public static void main(String[] args) {

        int firstNumber = 96;
        int secondNumber = 69;

        int oneResult = firstNumber + secondNumber;
        int twoResult = firstNumber - secondNumber;
        int threeResult = firstNumber * secondNumber;
        int fourResult = firstNumber / secondNumber;
        int fiveResult = firstNumber % secondNumber;

        oneResult += 10;
        twoResult -= 10;
        threeResult *= 10;
        fourResult /= 10;
        fiveResult %= 10;

        oneResult++;
        twoResult--;

        System.out.println(oneResult);
        System.out.println(twoResult);
        System.out.println(threeResult);
        System.out.println(fourResult);
        System.out.println(fiveResult);

        String text = "ABC";
        if (text == "ABC") {
            System.out.println("True it is!");
        }

        if ((firstNumber > 40) && (secondNumber <= 100)) {
            System.out.println("OOO!");
        }

        if ((firstNumber > 40) || (secondNumber >= 100)) {
            System.out.println("111!");
        }


        // Ternary operator
        int num = 8;
        String msg = num > 10 ? "Number is greater then 10" : "Number is less than or equal to 10";
        System.out.println(msg);
    }
}
