package week7;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, enter the month number 1 -12");
        int month = input.nextInt();
        input.close();

        if (month >= 1 && month <= 12){

            String[] data = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Sep","Oct","Nov","Dec"};

            System.out.println(data[month -1]); // -1 allows the month to become an index, because indexes start from 0
            // the above line prints one element from the array, which was a String

        }else {
            System.out.println("Sorry "+ month + " is not a valid number");
        }



    }
}
/*
Months [array]

	Create a program that will define an array with all the months in order. Use this array to help print the full name of a month by giving a number

	Ex:
		input: 1
		output: January

		input: 11
		output: November

	Other variations of this task we have done before: word to number, number to word
 */