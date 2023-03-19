package week6;

public class StoreItemObject {
    public static void main(String[] args) {

        Item apples = new Item();
        apples.setInfo("Apples", 20, 1.35);
        System.out.println(apples);

        Item book = new Item();
        book.setInfo("Java Book", 4, 150);
        System.out.println(book);



        apples.sellItem(10);
        System.out.println(apples);

        book.sellItem(5);
        System.out.println(book);

        book.sellItem(4);
        System.out.println(book);

    }
}
