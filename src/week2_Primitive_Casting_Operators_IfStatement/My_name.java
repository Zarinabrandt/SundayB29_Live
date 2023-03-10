package week2_Primitive_Casting_Operators_IfStatement;

public class My_name {

    public static void main(String[] args) {

        System.out.println( 5 + 3);
        System.out.println(5 + 3 + "hello");//8hello
        System.out.println("java" + 1 +2);//java12
        System.out.println("java" + (1+2));//java3

        int age = 30;
        String month = "March";
        String str = "In " + month + " you will turn "+ age;
        System.out.println(str);

        System.out.println("---------------------------------------");

        char l = 'Z',
                l2 = 'a',
                l3 = 'r',
                l4 = 'i',
                l5 = 'n',
                l6 = 'a';

        System.out.print(l);
        System.out.print(l2);
        System.out.print(l3);
        System.out.print(l4);
        System.out.print(l5);
        System.out.println(l6);

        System.out.println("My name is " + l + l2 + l3 + l4 + l5 + l6);




    }

}
