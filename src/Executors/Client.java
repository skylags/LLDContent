package Executors;

import PrintHelloWorldUsingThreads.PrintNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        for(int i = 1 ; i <= 1000000 ; i++){
            NumberPrinter task = new NumberPrinter(i);
            ex.submit(task);
        }
    }

}
