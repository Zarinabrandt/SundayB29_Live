package week8_MultiDimensionalArray_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {
    public static void main(String[] args) {

        ArrayList<String> digits = new ArrayList<>(Arrays.asList("123", "52", "513", "1842"));
        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : digits){

            String[] eachArr = each.split("");

            int sum = 0;

            for (String eachDigit : eachArr){
                //System.out.println(Integer.parseInt(eachDigit));

                sum += Integer.parseInt(eachDigit);
            }

            sums.add(sum);

        }
        System.out.println(digits);
        System.out.println(sums);


    }
}
