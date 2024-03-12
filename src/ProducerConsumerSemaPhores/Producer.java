package ProducerConsumerSemaPhores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore consSemaphore;
    private Semaphore prodSemaphore;
    Producer(Store st, Semaphore consSemaphore, Semaphore prodSemaphore) {
        this.store = st;
        this.consSemaphore = consSemaphore;
        this.prodSemaphore = prodSemaphore;
    }
    @Override
    public void run() {
        while(true){
            try {
                prodSemaphore.acquire();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            //consSemaphore.release();
        }
    }
}