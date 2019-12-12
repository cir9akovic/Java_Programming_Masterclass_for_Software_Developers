package arrays.linkedLists.myList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addItem(65);
        myLinkedList.addItem(11);
        myLinkedList.addItem(99);
        myLinkedList.addItem(17);
        myLinkedList.addItem(22);
        myLinkedList.addItem(9);
        myLinkedList.addItem(23);
        myLinkedList.addItem(4);

        //myLinkedList.modifyItem(11, 69);
        //myLinkedList.removeItem(4);
        //myLinkedList.removeAllEvenNumbers(myLinkedList);
        System.out.println(myLinkedList.findMaximum(myLinkedList));
        myLinkedList.removeItemAfterMaximum(myLinkedList);

        System.out.println("---------------------------------------------------");
        myLinkedList.showList(myLinkedList);

    }
}
