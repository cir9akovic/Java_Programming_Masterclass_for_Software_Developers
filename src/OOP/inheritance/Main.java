package OOP.inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1, 1, 10, 10, "Animal");

        Dog dog = new Dog(5,5,"John", 2,4,1,20,"long silky");
        dog.eat();
        dog.walk();

        Fish fish = new Fish(2,2,"Nemo", 3, 2, 2);
        fish.swim(20);
        fish.sleep();
    }
}
