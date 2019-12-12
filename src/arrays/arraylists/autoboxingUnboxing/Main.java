package arrays.arraylists.autoboxingUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // This can not be used because int is primitive type
        // ArrayList<int> myIntArrayList = new ArrayList<>();


        // We must use Integer class
        ArrayList<Integer> myIntArrayList = new ArrayList<>();
        myIntArrayList.add(24);
        myIntArrayList.add(36);
        myIntArrayList.add(9);

        Integer myIntClass = 45; // Integer.valueOf(45)  Autoboxing
        int myInt = myIntClass.intValue(); // Unboxing
        System.out.println(myInt);
    }
}
