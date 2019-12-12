package arrays.arraylists.importantMethods;

import org.w3c.dom.css.CSSStyleSheet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IndexListoflistsSubListSorting {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("blue");
        colours.add("orange");
        colours.add("red");
        colours.add("green");
        colours.add("orange");

        // Index of  first element
        int idx1 = colours.indexOf("orange");
        System.out.println(idx1);

        // Index of  last element
        int idx2 = colours.lastIndexOf("orange");
        System.out.println(idx2);

        System.out.println("--------------------------------------------------------------------------------------");

        // ArrayList of ArrayLists
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(22);
        l2.add(44);
        l2.add(66);
        l2.add(88);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(111);
        l3.add(122);
        l3.add(133);
        l3.add(144);

        // Arraylist in ArrayList
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        numbers.add(l1);
        numbers.add(l2);
        numbers.add(l3);

        System.out.println(numbers);
        System.out.println("---------------------------------------------------------------------------------------");

        // SubList
        ArrayList<String> items = new ArrayList<>();
        items.add("coin");
        items.add("pen");
        items.add("cup");
        items.add("notebook");
        items.add("glass");
        items.add("chair");
        items.add("ball");
        items.add("bowl");

        List<String> subItems = new ArrayList<>();
        subItems = items.subList(2, 6);
        System.out.println(subItems);

        // Size and get
        for(int i=0; i<subItems.size(); i++){
            System.out.println(subItems.get(i));
        }

        // Sorting
        Collections.sort(subItems);
        // Reverse
        Collections.sort(subItems, Collections.reverseOrder());
        System.out.println(subItems);
    }
}
