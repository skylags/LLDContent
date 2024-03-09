package AdderSubtractorSynchronised;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Void> a = ex.submit(adder);
        Future<Void> b = ex.submit(subtractor);

        a.get();
        b.get();

        System.out.println(count.value);
        //System.out.println(adder.c);
    }
}
