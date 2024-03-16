package Collections;

import java.util.*;

public class Client {
    /*
    Collection interface is the root interface of the Java collections
    framework. Majorly 3 interfaces List, Queue, Set extends the collection
    interface.
    List - ArrayList, LinkedList, Stack, Vector
    Set - HashSet, LinkedHashSet, EnumSet, TreeSet
    Queue - PriorityQueue, Deque
     */

    /*
    One interface can extend multiple interfaces
    One class can implement multiple interfaces
    one class can extend multiple classes - Diamond problem, have a way to do this
     */

    public static void main(String[] args) {
        //List - sequence of elements
        //ArrayList - Resizeable implementation of List interface
        //Array list is actually implemented using arrays
        //Not thread safe
        List<String> ls1 = new ArrayList<>();
        ls1.add("Umang");
        ls1.add("Archana");
        ls1.add("Sachin");
        ls1.add("Abdul");
        ls1.add("Karthikey");

        //Random access using indexes is faster in array list as compared to LinkedList

        //Doubly-linked list implementation of the List and Deque interfaces.
        //Doubly ended queues - Deque, best way to is to use doubly linked list
        List<String> ls2 = new LinkedList<>();

        //Vector - thread safe, use it in multi threaded environment
        List<String> ls4 = new Vector<>();
        //just an extension from vector which supports LIFO
        //push, pop, peek, size -- these methods, thread safe
        List<String> ls3 = new Stack<>();

        /*
        Set Interface - Not thread safe
        No duplicate elements
        constant time operations for search and insert - almost O(1)
         */

        //HashSet - No order confirmation
        Set<String> s1 = new HashSet<>();
        s1.add("Umang");
        s1.add("Archana");
        s1.add("Sachin");
        s1.add("Abdul");
        s1.add("Karthikey");
        System.out.println(s1);

        //TreeSet - maintains alphabetical order - natural ordering
        Set<String> s2 = new TreeSet<>();
        s2.add("Umang");
        s2.add("Archana");
        s2.add("Sachin");
        s2.add("Abdul");
        s2.add("Karthikey");
        System.out.println(s2);

        //order confirmation in which you inserted
        Set<String> s3 = new LinkedHashSet<>();
        s3.add("Umang");
        s3.add("Archana");
        s3.add("Sachin");
        s3.add("Abdul");
        s3.add("Karthikey");
        System.out.println(s3);

        //EnumSet
        //Enum - clear?
        Payment p1 = new Payment();
        p1.PaymentStatus = PaymentStatus.APPROVED;
        Payment p2 = new Payment();
        p2.PaymentStatus = PaymentStatus.REJECTED;

        //ACCEPTS A LIST OF ENUMS AND CREATES A SET OF THE ENUMS
        Set<PaymentStatus> s4 = EnumSet.allOf(PaymentStatus.class);
        System.out.println(s4);

        /*
        QUEUE INTERFACE
        Priority Queues
         */
        Queue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) { //Comparator function
                //negative = a will appear before b in the final ordering
                //positive  = b will appear before a
                // 0 - don't care who comes first
                //a < b = -ive, otherwise +ive
//                if(a.compareTo(b) > 1) {
//                    return -1;
//                } else return 1;
                return b.compareTo(a);
                //-ive if b is smaller than a
            }
        });
        q.add("Umang");
        q.add("Archana");
        q.add("Sachin");
        q.add("Abdul");
        q.add("Karthikey");

        while(!q.isEmpty()){
            System.out.println(q.peek()); //front
            q.poll(); //pop
        }

    }


}
