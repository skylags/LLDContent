package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        List<Integer> arr = List.of(8,1,2,4,5,2,10,1,4,90);
        ExecutorService ex = Executors.newCachedThreadPool();
        Sorter newTask = new Sorter(arr, ex);


        Future<List<Integer>> sortedArray = ex.submit(newTask);

        List<Integer> finalSortedArray = sortedArray.get();
        System.out.println(finalSortedArray);
    }
}
