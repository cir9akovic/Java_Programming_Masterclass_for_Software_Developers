package controlFlow;

public class WhileDoWhile {

    public static void main(String[] args) {

        /* infinite loop
        while (true){
            System.out.println("Stop it!");
        } */

        int count = 0;
        while (count < 5){
            System.out.println(count);
            count++;
        }

        System.out.println("------------------------------------");

        int count2 = 0;
        do{
            System.out.println("Do While Do " + count2);
            count2++;
        }while (count2 < 4);

        System.out.println("-------------------------------------");

        int count3 = 3;
        do {
            System.out.println(count3);
            count3++;

            //Exiting while loop
            if (count3 > 10)
                break;
        }while (count3 != 2);
    }
}
