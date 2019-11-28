package OOP.constructors;

public class mainClass {

    public static void main(String[] args) {

        ConstructorsExample conEx = new ConstructorsExample();
        System.out.println(conEx.getFirstName());
        System.out.println(conEx.getLastName());

        ConstructorsExample conEx2 = new ConstructorsExample("Milos","Cirjakovic", "Belgrade", 111, 100.99);
        System.out.println(conEx2.getFirstName());
        System.out.println(conEx2.getLastName());
        System.out.println(conEx2.getAge());

        ConstructorsExample conEx3 = new ConstructorsExample("Janko", "Jankovic");
        System.out.println(conEx3.getFirstName());
        System.out.println(conEx3.getLastName());
        System.out.println(conEx3.getAge());

    }
}
