package OOP.inheritance;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void move(int speed){
        System.out.println("Moving at " + speed + " km/h");
    }

    // Only subclasses can use
    protected void sleep(){
        System.out.println("Sleeping...");
    }

    public static void test(){
        System.out.println("TEST");
    }
}
