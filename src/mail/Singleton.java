package mail;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}
    public static Singleton getInstance(){
        return singleton;
    }
    public void wright(){
        System.out.println("Test");
    }
}
