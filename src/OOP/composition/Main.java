package OOP.composition;

public class Main {

    public static void main(String[] args) {

        // One example of composition in object instances
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", 240, dimensions);

        // Another example of composition in object instances
        Monitor monitor = new Monitor("27inch","Asus", 27, new Resolution(2540, 1440) );

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);

        // Calling method from monitor class
        pc.getMonitor().drawPixelAt(11,31, "Red");
        // Calling method from motherboard class
        pc.getMotherboard().loadProgram("VLC Player");
        // Calling method from case class
        pc.getTheCase().pressPowerButton();



    }
}
