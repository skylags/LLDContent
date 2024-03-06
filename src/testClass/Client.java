package testClass;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        HelloWorldPrinter h1 = new HelloWorldPrinter();
        Thread t = new Thread(h1);
        t.start();
    }
}
