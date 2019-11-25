package methods.overridingMethods;
;
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void move(String direction){
        System.out.println("Dog is moving " + direction);
    }
}
