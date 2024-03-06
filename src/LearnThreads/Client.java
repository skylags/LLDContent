package LearnThreads;

public class Client {
    static void doSomething(){
        System.out.println("Doing something in thread : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        HelloWorldPrint task1 = new HelloWorldPrint();
        Thread t1 = new Thread(task1);
        t1.start(); //equivalent to calling run()

        //task1.run();

        doSomething();
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}
