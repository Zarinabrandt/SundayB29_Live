package week10_Encapsulation;

import java.util.ArrayList;

public class DrinkVending {

    ArrayList<Drink> allDrinks;

    public DrinkVending(){
        allDrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks){
        this(); //calls the no arg(argument) constructor
        allDrinks = inputDrinks; // add all of the drink Drinks objects from the inputDrinks into the instance allDrinks ArrayList
    }

    public String toString(){

        String output = "";
        for ( Drink each : allDrinks) {
            output += each + "\n";
        }
        return output;
    }


}
/* DrinkVending machine = new DrinkVending()
    assume there is drinks already
    machine.allDrinks.get(0).name -> access to the name of the first drink
     */