package week11_Inheritance_Overriding.access.b;

public class RunnerB {
    public static void main(String[] args) {

        Mac obj = new Mac();
        System.out.println(obj.os);
        //System.out.println(obj.memory); protected is, inherited in sub classes, but not access directly.
        //System.out.println(obj.brand); this was default, in a different package
        // System.out.println(obj.hasWifi); this was private, only within class
    }
}
