package AdderSubtractorSynchronised;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Count count; //object of Count class
    public Adder(Count cnt) {
        this.count = cnt;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 100000; i++) {
            synchronized (count){
                count.value += i;
            }
        }
        return null;
    }

}
