package OOP.challengeExercise;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public double getPrice() {
        return price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1 (String name, double price){
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addAddition2 (String name, double price){
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addAddition3 (String name, double price){
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addAddition4 (String name, double price){
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double totalPrice(){

        double totalPrice = this.price;

        if(additionName1 != null){
            totalPrice += additionPrice1;
        }
        if(additionName2 != null){
            totalPrice += additionPrice2;
        }
        if(additionName3 != null){
            totalPrice += additionPrice3;
        }
        if(additionName4 != null){
            totalPrice += additionPrice4;
        }

        return totalPrice;
    }
}
