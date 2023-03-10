package week4_methods_of_string;

import java.util.Scanner;

public class ModifyWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //String word = "java";  // hard coded
        String word = input.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length() -1); // last index: str.length() -1
        String middle = word.substring(1, word.length()-1);

        if(first == last){  // we use == because we are comparing char types
            System.out.println(middle);
        }else {
            System.out.println("*" +middle+ "#");
        }



    }
}
