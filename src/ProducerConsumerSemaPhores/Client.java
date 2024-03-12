package ProducerConsumerSemaPhores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);
        Semaphore prodSemaphore = new Semaphore(5);
        Semaphore consSemaphore = new Semaphore(0);
        //8 producers to produce
//        Producer p1 = new Producer(store, consSemaphore, prodSemaphore);
//        Producer p2 = new Producer(store, consSemaphore, prodSemaphore);
//        ex.execute(p1);
//        ex.execute(p2);
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store, consSemaphore, prodSemaphore));
            //Producer p1 = new Producer(store, prodSemaphore);
            //p1.run();
        }

        //just create 8 producers and give them to the thread pool to run the run() method
        //20 consumers to consume
        for(int i = 1 ; i <=20; ++i){
            ex.execute(new Consumer(store, consSemaphore, prodSemaphore));
        }

        //finally the thread pool will have 28 tasks(20 consumers + 8 producers)


        //just create 20 consumers and given them to the thread pool
    }

}