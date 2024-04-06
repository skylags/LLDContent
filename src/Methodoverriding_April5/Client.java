package Methodoverriding_April5;

public class Client {
    public static void main(String[] args) {
        A b = new B();
        b.doSomething();


        A a = new A();
        a.doSomething("Umang");

        B c = new C();
        c.doSomething();

        A b1 = new B();
        b.doSomething();

    }
}
