package arrays.arraylists;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GroceryList gl = new GroceryList();

        gl.addGroceryItem("Apple");
        gl.addGroceryItem("Banana");
        gl.addGroceryItem("Lime");
        gl.addGroceryItem("Kiwi");

        gl.modefyGroceryItem("Banana", "Papaya");
        gl.removeGroceryItem("Kiwi");
        gl.removeGroceryItem("Grape");
        gl.printGroceryList();
        gl.findPrintItem("Banana");

        // copy arrayList
        ArrayList<String> newGL = new ArrayList<>(gl.getGroceryList());
        // or
        // newGL.addAll(gl.getGroceryList());

        System.out.println(newGL.size());

        // arrayList to array
        String[] myArray = new String[gl.getGroceryList().size()];
        myArray = gl.getGroceryList().toArray(myArray);

        // Add in specific index
        // IndexOutOfBoundsExeption
        ArrayList<Integer> intList = new ArrayList<>();
        // intList.add(2,4);
        for (int i=0; i<intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
