package week6;

public class Item {

    String name;
    int quantity;
    double unitPrice;

    public void setInfo(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void sellItem(int number ){// this number buying for
        if (quantity >= number){
            System.out.println(number +" " + name + " for $" + (unitPrice * number));
            quantity -= number;
        }else {
            System.out.println("Sorry we only have "+ quantity);
        }

    }

    @Override
    public String toString() {
        return "Item: " + name +" | " + quantity + " | $" + unitPrice;
                /*
                "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';

                 */
    }
}
/*
Item [object type]

        create a class called Item
        declare these instance variables:
        name, quantity, unitPrice

        create a setInfo() method to initialize these variables

        create a sellItem method that will accept an argument for how many items you want to buy
        first check if there is enough quantity left of the item
        if there is enough print:
        Selling: $quantity $name for $totalPrice
        - calculate the totalPrice by doing the quantity being bought and unitPrice
        - afterward reduce the quantity of the item from how many were sold

        create a toString() that shows the item information in the following format:
        ITEM: $name | $quantity | $unitPrice

        create a different class and create some Item objects

 */