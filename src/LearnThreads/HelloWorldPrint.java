package LearnThreads;

public class HelloWorldPrint implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread in task is " + Thread.currentThread().getName());
        System.out.println("Hello World");
    }
}
