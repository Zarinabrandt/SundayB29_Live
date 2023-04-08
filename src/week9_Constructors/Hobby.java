package week9_Constructors;

public class Hobby {

    public String name;
    public double annalCost;
    public boolean isOutdoors;
    public boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annalCost) {
        this.name = name;
        this.annalCost = annalCost;
    }

    public Hobby(String name, double annalCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annalCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing "+ name + (isOutdoors ? " outside" : " inside"));
    }


    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annalCost=" + annalCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
