package mail;

import java.util.ArrayList;

public class Mailbox {

    private String address;
    private String password;
    public Message message;
    public boolean loggedIn = false;
    ArrayList<Message> messages = new ArrayList<>();

    private static Mailbox mailbox = new Mailbox();

    private Mailbox() {}

    public static Mailbox getInstance(){
        return mailbox;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Message writeMessage(String text, String receiverName){
        message = new Message(text, getAddress(), receiverName);
        message.getMail = false;
        message.showMessage();
        return message;
    }
    public void readMessage(){
        if(messages.contains(message)){
            message.getMail = true;
            message.showMessage();
        }
        else System.out.println("You have no messages");
    }
}