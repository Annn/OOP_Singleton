package mail;

import java.util.Date;

public class Message {
    private String messageText;
    private String sender;
    private String receiver;
    public Date sendingDate = new Date();
    public boolean getMail = false;

    public Message(String text, String sender, String receiver){
        this.messageText = text;
        this.sender = sender;
        this.receiver = receiver;
    }

    public void showMessage(){
        if (getMail) System.out.println("You have a message from " + sender + ": \"" + messageText + "\"");
        else System.out.println("You send a message to: " + receiver + " \"" + messageText + "\"");
    }

}
