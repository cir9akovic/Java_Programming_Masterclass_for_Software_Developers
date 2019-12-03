package OOP.challengeExercise;

public class Main {

    public static void main(String[] args) {

       /*
         This solution is not 100% perfect. Solution is made before learning Lists or Arrays
        */

       Hamburger hamburger = new Hamburger("Basic", "Sousage", 211.11, "white");
       hamburger.addAddition1("onion", 11.99);
       double hamburgerPrice = hamburger.totalPrice();

       HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 439.99);
       healthyHamburger.addHealthAddition1("Egg", 19.79);
       healthyHamburger.addHealthAddition2("Lentils", 14.11);
       double healthyHamburgerPrice = healthyHamburger.totalPrice();

       System.out.println("Price of a Hambuger with additions is: " + hamburgerPrice);
       System.out.println("Price of a healthy Hambuger with additions is: " + healthyHamburgerPrice);

       DeluxeBurger deluxeBurger = new DeluxeBurger(593.89);
       double deluxeBurgerPriceWithBonus = deluxeBurger.priceWithBonus();
       double deluxeBurgerPriceWithOutBonus = deluxeBurger.priceWithOutBonus();

       System.out.println("Price of a Deluxe Hambuger with bonus: " + deluxeBurgerPriceWithBonus);
       System.out.println("Price of a Deluxe Hambuger with out bonus: " + deluxeBurgerPriceWithOutBonus);
    }
}
