package week9_Constructors;

public class Hobby {

    public String name;
    public double annualCost;
    public boolean isOutdoors;
    public boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annalCost) {
        this.name = name;
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing "+ name + (isOutdoors ? " outside" : " inside"));
    }


    public String toString() {
        return "\nHobby{" +
                "name='" + name + '\'' +
                ", annalCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
