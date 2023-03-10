package week2_Primitive_Casting_Operators_IfStatement;

public class Operators_examples {

    public static void main(String[] args) {

        int age = 10;
        age++;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);

        int num = 5;//6
        System.out.println(++num);
        System.out.println(num++);

        /*
        num++
        think of it as
        num
        num + 1
         */

        int x = 15;
        int y = x++;
        System.out.println("x" + x);// x = 15
        System.out.println("y" + y);// y = 15

        int z = 90;
        int w = --z;
        System.out.println("z " + z);//z = 89
        System.out.println("w " + w);//w = 89

        int a = 3;
        int b = 5;
        a++;
        int c = a + b;//9
        System.out.println(c);

    }

}
