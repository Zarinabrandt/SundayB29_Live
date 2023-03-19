package week6;

public class UseAddressObject {

    public static void main(String[] args) {

        Address address1 = new Address();
        System.out.println(address1);

        address1.setInfo("2345 Desert Oak", "Sierra Vista", "AZ", 12345, "USA");

        System.out.println(address1);

        Address address2 = new Address();
        System.out.println(address2);

        address2.setInfo("1010 Horner Dr", "Manassas", "AZ", 12345,"US");

        System.out.println(address2);

    }

}
