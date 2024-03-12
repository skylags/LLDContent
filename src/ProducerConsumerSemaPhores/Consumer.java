package ProducerConsumerSemaPhores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore consSemaphore;
    private Semaphore prodSemaphore;

    Consumer(Store st, Semaphore consSemaphore, Semaphore prodSemaphore){
        this.store = st;
        this.consSemaphore = consSemaphore;
        this.prodSemaphore = prodSemaphore;
    }
    @Override
    public void run() {
        while(true){
            try {
                consSemaphore.acquire();
                //Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSemaphore.release();
        }
    }
}