package arrays.linkedLists.myList;

public class MyLinkedList {

    private Knot first;
    private Knot helpPointer;
    private Knot previous = first;

    public boolean isEmpty(){
        return first == null;
    }

    public void showList(MyLinkedList list){

        if (isEmpty()){
            System.out.println("List is empty!");
        }else {
            helpPointer = first;
            while (helpPointer != null) {
                System.out.println(helpPointer.item);
                helpPointer = helpPointer.next;
            }
        }
    }

    public void addItem(int item){

        if(isEmpty()){
            first = new Knot(item, null, null);
            previous = first;
        }else {
            helpPointer = new Knot(item, previous, null);
            previous.next = helpPointer;
            previous = helpPointer;

        }
    }

    public void modifyItem(int oldItem, int newItem){

        if(isEmpty()) {
            System.out.println("Old item is not in list!");
        }else {
            helpPointer = first;
            while (helpPointer.item != oldItem && helpPointer.next != null){
                    helpPointer = helpPointer.next;
                }
            if(helpPointer.item == oldItem) {
                helpPointer.item = newItem;
            }else{
                System.out.println("Old item is not in list!");
            }
        }
    }

    public void removeItem(int item){

        Knot anotherItem;

        if (isEmpty()){
            System.out.println("List is already empty!");
        }else {
            helpPointer = first;
            while (helpPointer.item != item && helpPointer.next != null){
                helpPointer = helpPointer.next;
            }
            if(helpPointer.previous != null && helpPointer.next != null){
                anotherItem = helpPointer.previous;
                anotherItem.next = anotherItem.next.next;
                anotherItem.next.previous = anotherItem;
            }else if(helpPointer.previous == null){
                first = helpPointer.next;
            }else if(helpPointer.next == null && helpPointer.item == item){
                anotherItem = helpPointer.previous;
                anotherItem.next = null;
            }else {
                System.out.println("Item is not in list!");
            }
        }
    }

    public void removeAllEvenNumbers(MyLinkedList list){
        if (isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            helpPointer = first;
            while (helpPointer != null){
                if(helpPointer.item % 2 == 0){
                    removeItem(helpPointer.item);
                }
                helpPointer = helpPointer.next;
            }
        }
    }

    public int findMaximum(MyLinkedList list){

        int max = Integer.MIN_VALUE;

        if (isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            helpPointer = first;
            while (helpPointer != null){
                if(max < helpPointer.item){
                    max = helpPointer.item;
                }
                helpPointer = helpPointer.next;
            }
        }
        return max;
    }

    public void removeItemAfterMaximum(MyLinkedList list){
        if (isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            int maxItem = findMaximum(list);
            helpPointer = first;
            while (helpPointer.item != maxItem && helpPointer.next != null){
                helpPointer = helpPointer.next;
            }
            if(helpPointer.next == null) {
                System.out.println("Last number is maximum!");
            }else if(helpPointer.next.next != null){
                helpPointer.next = helpPointer.next.next;
                helpPointer.next.previous = helpPointer;
            }else if(helpPointer.next.next == null){
                helpPointer.next = null;
            }else {
                helpPointer = helpPointer.previous;
                helpPointer.next = helpPointer.next.next;
                helpPointer.next.previous = helpPointer;
            }
        }
    }


    //------------------------------------------------------------------------------------------------------------------

    private class Knot{

        private int item;
        private Knot previous;
        private Knot next;

        private Knot(int item, Knot previous, Knot next) {
            this.item = item;
            this.previous = previous;
            this.next = next;
        }
    }
}
