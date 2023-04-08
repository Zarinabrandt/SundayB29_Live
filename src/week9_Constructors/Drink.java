package week9_Constructors;

public class Drink {

 /*
	Create a Drink class:
		create instance variables: name, price, quantity
		create a constructor to initialize all the variables
		create a toString to print the object in a clean format
     */

    public String name;
    public double price;
    public int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(){
        return name + " - " + price + " | remaining: " +  quantity;
    }

}
