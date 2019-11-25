package methods.overridingMethods;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(String direction){
        System.out.println("Moving " + direction);
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }

}
