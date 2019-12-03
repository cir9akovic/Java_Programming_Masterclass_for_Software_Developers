package OOP.challengeExercise;

public class DeluxeBurger extends Hamburger{

    private Bonus bonus = new Bonus("Chips and Drink", 4.21);

    public DeluxeBurger(double price) {
        super("Deluxe", "Sausage & Bacon", price, "White");
    }

    public double priceWithBonus(){

        double totalPrice;
        totalPrice = super.getPrice() + bonus.getPrice();

        return totalPrice;
    }

    public double priceWithOutBonus(){

        double totalPrice;
        totalPrice = super.getPrice();

        return totalPrice;
    }
}
