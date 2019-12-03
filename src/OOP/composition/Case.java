package OOP.composition;

public class Case {

    private String model;
    private String manufacturer;
    private int powerSlupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, int powerSlupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSlupply = powerSlupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed!");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSlupply() {
        return powerSlupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
