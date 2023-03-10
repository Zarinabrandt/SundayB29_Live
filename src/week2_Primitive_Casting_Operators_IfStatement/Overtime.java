package week2_Primitive_Casting_Operators_IfStatement;

public class Overtime {

    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int hoursWorked = 40;
        double netPay;
        String message;

        if (hoursWorked > 40){

            int overTimeHours = hoursWorked - 40;
            netPay = hourlyRate * 40;//normal pay from 40 hours
            netPay += hourlyRate * 1.5 * overTimeHours;// for overtime, you get paid 1.5 times your rate
            message = "Wow you worked " + hoursWorked + " so you will get " + overTimeHours + " hours of overtime. Your net pay is $" + netPay;


        }else{// worked less than 40 hours
            netPay = hourlyRate * hoursWorked;
            message = "You worked " + hoursWorked + " hours, your total net pay is: $" + netPay;
        }

        System.out.println(message);

    }

}
