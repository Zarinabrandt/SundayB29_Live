package week8_MultiDimensionalArray_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondBiggest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,3,1,4,5,2,8,4,8,7,10));
        System.out.println(list);

        int max = Integer.MIN_VALUE; // good default for max
        int secondMax = list.get(0);

        for (int each : list){

            if (each > max){
                secondMax = max;
                max = each;
            }

            if (each > secondMax && each < max){
                secondMax = each;
            }

        }
        System.out.println("Max: "+ max);
        System.out.println("Second Max: "+ secondMax);

    }
}
