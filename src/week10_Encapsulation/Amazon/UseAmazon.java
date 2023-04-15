package week10_Encapsulation.Amazon;

public class UseAmazon {
    public static void main(String[] args) {

        AmazonAccount account1 = new AmazonAccount("javaiscool", "java4lyfe@gmail.com", false);

        //account1.email  -> cannot access because it is private

        System.out.println(account1.getEmail());

        account1.setEmail("javausedtobecool@gmail.com");

    }
}
