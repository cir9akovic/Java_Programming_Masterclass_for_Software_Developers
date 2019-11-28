package OOP.constructors;

public class ConstructorsExample {

    private String firstName;
    private String lastName;
    private String hometown;
    private int age;
    private double moneyBalance;

    public ConstructorsExample(){
        // Calling another constructor within a constructor (must be first line of code)
        this("Petar", "Petrovic", "Belgrade", 25, 100.21);
        System.out.println("Empty constructor called");
    }

    public ConstructorsExample(String firstName, String lastName, String hometown, int age, double moneyBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hometown = hometown;
        this.age = age;
        this.moneyBalance = moneyBalance;
    }

    public ConstructorsExample(String firstName, String lastName) {
        this(firstName, lastName, "Novi Sad", 30, 99.99);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 100 && age >= 0){
            this.age = age;
        }else {
            System.out.println("Invalid age number!");
        }
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
       this.moneyBalance = moneyBalance;
    }
}
