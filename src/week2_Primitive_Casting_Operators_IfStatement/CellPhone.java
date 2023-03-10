package week2_Primitive_Casting_Operators_IfStatement;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple",
                model = "IPhone X",
                color = "Black";
        double price = 1200.99;
        int storage = 128;
        boolean hasCamera = true;
        char simType = 'A';

        System.out.println("We have a brand new " + model + " from " + brand);
        System.out.println("It comes in the color " + color + " and has " + storage + "GB memory");
        System.out.println("It has a camera: " + hasCamera + " and operates with the \"" + simType + "\" type sim");
        System.out.println("Get your very own " + model + " for only $" + price);


    }

}
