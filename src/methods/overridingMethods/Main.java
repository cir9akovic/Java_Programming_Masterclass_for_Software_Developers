package methods.overridingMethods;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("John");
        System.out.println(animal.getName());
        animal.move("backwards");
        animal.eat("fish");

        Dog dog = new Dog("Pablo");
        System.out.println(dog.getName());
        dog.move("forward");
        dog.eat("apple");

        /* Overriding and Access-Modifiers : The access modifier for an overriding method can allow more, but not less,
        access than the overridden method. For example, a protected instance method in the super-class can be made public,
        but not private, in the subclass. Doing so, will generate compile-time error. */

        // Final methods can not be overridden
        // Private methods can not be overridden

        // The overriding method must have same return type (or subtype)

        /* Overriding and abstract method: Abstract methods in an interface or abstract class are
        meant to be overridden in derived concrete classes otherwise a compile-time error will be thrown */

        /* Static methods can not be overridden(Method Overriding vs Method Hiding)
        We can declare static methods with same signature in subclass,
        but it is not considered overriding as there won’t be any run-time polymorphism */

        /* We can return different type of overriding method if it is subclass */

    }
}
