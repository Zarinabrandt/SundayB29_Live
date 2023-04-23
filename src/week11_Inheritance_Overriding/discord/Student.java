package week11_Inheritance_Overriding.discord;

public class Student extends DiscordUser{

    int loveForJava;
    public Student(String name, int id, int loveForJava) {
        super("Student", name, id);
        this.loveForJava = loveForJava;
    }

    public void sendMessage(String name){
        System.out.println("Sending message to "+ name);
    }

    public static void launch(){ // not overriding, we hide the original by creating a new one
        System.out.println("Student opening");
    }

    //public static void launch(){
    //    System.out.println("Connecting to server");
    //}

}
 /*
        - Student class inherits DiscordUser class

        - create constructor to call parent constructor and set up variables (role - Student, name, id)

        - overload the sendMessage(String name) to accept a String for the chat name
            print Sending message to $name
     */