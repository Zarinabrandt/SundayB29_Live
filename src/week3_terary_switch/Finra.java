package week3_terary_switch;

public class Finra {
    public static void main(String[] args) {

        int num = 15;
        boolean by3 = num % 3 ==0;
        boolean by5 = num % 5 ==0;

        if(by3 && by5){
            System.out.println("FINRA");
        } else if (by3) {
            System.out.println("FIN");
        } else if (by5) {
            System.out.println("RA");
        }else {
            System.out.println(num);
        }
        System.out.println(by3 && by5 ? "FINRA" : by3 ? "FIN" : (by5) ? "RA" : num);

    }
}
