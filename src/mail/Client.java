package mail;

public class Client {
    private Mailbox mailBox;
    private String name;
    private String password;

    public Client(String n, String pswd){
        this.name = n;
        this.password = pswd;
        mailBox = Mailbox.getInstance();
    }

    public String getName(){ return name; }
    public String getPassword(){ return  password; }

    public void getMail(){
        if (mailBox.loggedIn){
            mailBox.readMessage();
        }
        else System.out.println("To see the mail, please, log in");
    }

    public void sendMessage(String text, String receiver){
        if (mailBox.loggedIn){
            mailBox.setAddress(name);
            mailBox.setPassword(password);
            Message message = mailBox.writeMessage(text, receiver);
            mailBox.messages.add(message);
        }
        else {
            System.out.println("To send a message, please, log in");
        }
    }

     public void logIn(String name, String pswd){
        if (pswd == this.password && name == this.name){
            mailBox.loggedIn = true;
        }
        else System.out.println("Incorrect data");
     }
}
