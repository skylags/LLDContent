package AdderSubtractorSyncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();

        Count count = new Count(0);
        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Void> a = ex.submit(adder);
        Future<Void> b = ex.submit(subtractor);

        a.get();
        b.get();


        System.out.println(count.value);
    }
}
