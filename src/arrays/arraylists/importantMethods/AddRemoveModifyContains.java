package arrays.arraylists.importantMethods;

import java.util.ArrayList;

public class AddRemoveModifyContains {

    public static void main(String[] args) {

        ArrayList<String> firstArray = new ArrayList<>();
        // Add element in the list
        firstArray.add("USA");
        firstArray.add("Canada");
        firstArray.add("Spain");
        firstArray.add("Italy");
        firstArray.add("Serbia");
        firstArray.add("Russia");

        // Add element in specific position in the list
        firstArray.add(2, "China");

        ArrayList<String> secondArray = new ArrayList<>();
        // Add element in the list
        secondArray.add("BMW");
        secondArray.add("Audi");
        secondArray.add("FIAT");
        secondArray.add("Porsche");
        secondArray.add("Kia");
        secondArray.add("Seat");

        /* Add element in specific position in the lists
           IndexOutOfBoundsException
           firstArray.add(8, "Test");
        */

        System.out.println(firstArray);
        System.out.println(secondArray);

        // Add list od elements
        firstArray.addAll(secondArray);

        // Add list od elements begin at specific index
        secondArray.addAll(3, firstArray);

        System.out.println(firstArray);
        System.out.println(secondArray);

        // Modify list
        firstArray.set(4, "!TEST!");
        System.out.println(firstArray);

        // ReplaceAll
        firstArray.replaceAll(x -> x.toLowerCase());
        System.out.println(firstArray);

        // Remove element from the list
        secondArray.remove(4);
        System.out.println(secondArray);
        secondArray.remove("Audi");
        System.out.println(secondArray);

        // Remove with condition
        firstArray.removeIf(x -> (x.contains("a")));
        System.out.println(firstArray);

        // Remove all elements that are contained in the specified collection
        ArrayList<String> helpArray = new ArrayList<>();
        helpArray.add("porsche");
        helpArray.add("bmw");
        firstArray.removeAll(helpArray);
        System.out.println(firstArray);

        // Remove all elements from the list
        firstArray.clear();
        System.out.println(firstArray);

        // isEmpty
        System.out.println(firstArray.isEmpty()); //True or False

        // Copy or clone
        ArrayList<String> newArray = new ArrayList<>();
        newArray = (ArrayList<String>) secondArray.clone();
        System.out.println(newArray);


        // If list contains the element
        System.out.println(newArray.contains("FIAT")); // True or False
    }
}
