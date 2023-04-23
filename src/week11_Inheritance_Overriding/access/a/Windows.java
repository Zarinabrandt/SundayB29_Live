package week11_Inheritance_Overriding.access.a;

public class Windows extends Computer{
    public static void main(String[] args) {


        Windows obj = new Windows();
        System.out.println(obj.os);
        System.out.println(obj.memory);
        System.out.println(obj.brand);
        //System.out.println(obj.hasWifi); this variable was private, so it is not inheritance

        System.out.println();
        System.out.println(obj);


    }

}
