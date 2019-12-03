package OOP.challengeExercise;

public class HealthyHamburger extends Hamburger {

    private String healthyAdditionName1;
    private double healthyAdditionPrice1;

    private String healthyAdditionName2;
    private double healthyAdditionPrice2;

    public HealthyHamburger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyAdditionName1 = name;
        this.healthyAdditionPrice1 = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyAdditionName2 = name;
        this.healthyAdditionPrice2 = price;
    }

    @Override
    public double totalPrice() {
        double totalPrice = super.totalPrice();
        if(healthyAdditionName1 != null){
            totalPrice += healthyAdditionPrice1;
        }
        if(healthyAdditionName2 != null){
            totalPrice += healthyAdditionPrice2;
        }

        return totalPrice;
    }
}
