package numbers;

public class Casting_types {

    public static void main(String[] args) {

        // 32 bits
        int myInt = 32;
        // 8 bits
        byte myByte = 12;
        // 16 bits
        short myShort = 21;

        int intResult = myInt/2;
        // Casting need to be done when operations go from bigger to smaller
        byte byteResult = (byte) (myByte/2);
        short shortResult = (short) (myShort/2);

        System.out.println(intResult);
        System.out.println(byteResult);
        System.out.println(shortResult);

        // 64 bits
        long myLong = 3232;
        // 64 bits
        // Double is bigger and faster then Float
        double myDouble = 14.5;
        // 32 bits
        // 'f' must be written because java see value like a double
        float myFloat = 23.421f;

        long longResult = myLong/2;
        double doubleResult = myDouble/2;
        float floatResult = myFloat/2;

        System.out.println(longResult);
        System.out.println(doubleResult);
        System.out.println(floatResult);

    }
}
