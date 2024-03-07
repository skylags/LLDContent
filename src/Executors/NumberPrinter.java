package Executors;

public class NumberPrinter implements Runnable{
    int noToPrint;
    NumberPrinter(int x){
        this.noToPrint = x;
    }
    @Override
    public void run() {
        System.out.println("Printing " + this.noToPrint + " in thread : " + Thread.currentThread().getName());
    }
}
