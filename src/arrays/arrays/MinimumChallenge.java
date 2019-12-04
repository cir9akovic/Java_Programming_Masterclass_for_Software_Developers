package arrays.arrays;

public class MinimumChallenge {

    public static void main(String[] args) {

        int array [] = {23,45,55,3,9,37};

        System.out.println(minEl(array));
    }

    private static int minEl(int[] array){

        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
