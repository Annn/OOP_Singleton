package mail;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("ann", "123");
//        Test: incorrect password
        client1.logIn("ann", "12");

        client1.getMail();

        Client client2 = new Client("vitalii", "111");
        client2.logIn("vitalii", "111");
        client1.getMail();

        client2.sendMessage("Hello world", "ann");
        client1.getMail();
    }
}
