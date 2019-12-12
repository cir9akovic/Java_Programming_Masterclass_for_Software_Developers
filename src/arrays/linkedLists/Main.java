package arrays.linkedLists;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedListPlaces llp = new LinkedListPlaces();

        llp.addToTheList("Sydney");
        llp.addToTheList("Melbourne");
        llp.addToTheList("Brisbane");
        llp.addToTheList("Perth");
        llp.addToTheList("Canberra");
        llp.addToTheList("Adelaide");
        llp.addToTheList("Darwin");

        llp.printList(llp.getPlacesToVisit());
        llp.addToTheListWithPossition(3,"New York");

    }
}
