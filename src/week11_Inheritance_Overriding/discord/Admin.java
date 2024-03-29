package week11_Inheritance_Overriding.discord;

public class Admin extends DiscordUser{
    public Admin(String name, int id){
        super("Admin",name,id);
    }

    public void createChannel(){
        System.out.println("Creating new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement");
    }


    public void sendMessages(String channel){
        System.out.println("Sending message to "+ channel);
    }
}
/*
            - Admin class inherits DiscordUser class
        - create constructor to call parent constructor and set up variables (role - Admin, name, id)
        - create method:
            createChannel()
                Example output: prints Creating new discord channel
        - override the sendMessage() to print: "Sending announcement"
     */