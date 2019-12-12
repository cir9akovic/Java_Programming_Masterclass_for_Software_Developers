package arrays.arraylists;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    // For copying list
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
        System.out.println("Item " + item + " is add on the list!");
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " item in the list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void findPrintItem(String searchItem){

        //boolean exists = groceryList.contains(searchItem);
        int position = onFile(searchItem);
        if(position >=0) {
            System.out.println("Item position on the list is: " + (position+1) + ". " + groceryList.get(position));
        }else {
            System.out.println("Item " + searchItem + " is not in list!");
        }
    }

    public void modefyGroceryItem(String itemName, String newItemName){

        int position = onFile(itemName);
        if(position >= 0) {
            groceryList.set((position), newItemName);
            System.out.println("Grocery item " + itemName + " has been replaced with " + newItemName);
        }else {
            System.out.println("Item " + itemName + " is not in list!");
        }
    }

    public void removeGroceryItem(String itemName){

        int position = onFile(itemName);
        if(position >= 0) {
            groceryList.remove(position);
            System.out.println("Grocery item " + itemName + " has been removed.");
        }else {
            System.out.println("Item " + itemName + " is not in list!");
        }
    }

    private int onFile(String itemName){
        int position = groceryList.indexOf(itemName);
        if (position >= 0){
            return position;
        }
        return -1;
    }
}
