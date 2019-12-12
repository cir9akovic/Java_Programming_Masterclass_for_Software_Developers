package arrays.linkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPlaces {

    private LinkedList<String> placesToVisit = new LinkedList<>();

    public LinkedList<String> getPlacesToVisit() {
        return placesToVisit;
    }

    public void addToTheList(String place){
        placesToVisit.add(place);
    }

    public void addToTheListWithPossition(int position, String place){
        placesToVisit.add(position,place);
    }

    public void printList(List linkedList){
        Iterator i = linkedList.iterator();
        if (linkedList.isEmpty()){
            System.out.println("List is empty!");
        }else {
            while (i.hasNext()) {
                System.out.println("Now visiting " + i.next());
            }
        }
        
    }
}
