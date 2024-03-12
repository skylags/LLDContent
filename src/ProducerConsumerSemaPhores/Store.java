package ProducerConsumerSemaPhores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize; //no of shelf in the store
    //private List<Object> items;
    private ConcurrentLinkedDeque<Object> items;
    //Concurrent DS

    Store(int maxSize){
        this.maxSize = maxSize;
        //this.items = new ArrayList<>();
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        //10 threads calling this method exactly at the same time
        // at this point, the size of items array is 8
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
        // items[] = {4,5,6,7,8,9} = items.size() = 6 - 1 = 5
        //items.remove(5) = {4,5,6,7,8} = items.remove(5)  = exception
        // 8 threads trying to remove 7th index, throw an exception - index out of bounds
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}

/*
package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize; //no of shelf in the store
    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove(this.items.size() - 1);
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}
 */