package week10_Encapsulation;

public class Drink {

    private String name;
    private double price;
    private int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String toString() {
        return name + " | $ " + price + " | Total quantity" + quantity;
    }
}
