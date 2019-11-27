package controlFlow;

public class ForFlow {

    public static void main(String[] args) {

        /* infinite loop
        for(;;){
            System.out.println("Stop it!");
        }
         */

        for(int i=0; i<=5; i++){
            System.out.println(i);
        }

        System.out.println("--------------------");

        for(int i=10; i>3; i--){
            System.out.println(i);
        }

        System.out.println("--------------------");

        //---------------------------------------------------------------------------------------------

        int count = 0;
        for(int i=15; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
            }   if(count == 5){
                System.out.println("Exiting for loop!");
                break;
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i<=(long)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
