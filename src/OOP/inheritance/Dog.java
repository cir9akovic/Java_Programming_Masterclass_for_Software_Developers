package OOP.inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Must have constructor with fields from super class
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        move(10);
        super.move(5);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog moving at speed: " + speed);
    }
}
