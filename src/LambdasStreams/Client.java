package LambdasStreams;


import LearnThreads.HelloWorldPrint;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        /*
        Runnable
        Callable
        Comparable
        Comparator
        Some of the interfaces which requires only 1 method to be implemented

        Functional Interface - An interface with only 1 method demanded.
        Lambdas - Way to create objects of the classes which implements functional interfaces

        () -> {} -----> Lambda expression
        parameters/input -> output
         */

        List<Student> lsStudent = new ArrayList<>();
        Student st1 = new Student(10, 90.0,"ABC");
        Student st2 = new Student(4, 81.0,"GHU");
        Student st3 = new Student(7, 87.0,"KBC");
        lsStudent.add(st1);
        lsStudent.add(st2);
        lsStudent.add(st3);

        //Method-1
        Collections.sort(lsStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return 0;
            }
        });

        //Method-2 (parameters)->{output}
        Collections.sort(lsStudent, (Student s1, Student s2) -> {
            return s1.univName.compareTo(st2.univName);
        });

        //Lambdas are just syntatical sugars.

        //I want to print hello world using a thread

        HelloWorldPrint task1 = new HelloWorldPrint();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable r = () -> {
            System.out.println("Hello World");
        };
        Thread t2 = new Thread(r);
        t2.start();

        Thread t3 = new Thread(() -> {
            System.out.println("Hello World");
        });

        t3.start();

        Thread t4 = new Thread(() -> System.out.println("Hello World"));
        t4.start();
        /*
        reference - if you have only 1 line in the curly braces, you can omit it.
        just like we omit curly braces in case if() { //omit }
         */
        /*
        I want to do some operations
        Addition
        subtraction
        multiplication
        division
         */

        MathematicalOperation additionOperation = (int a, int b) -> a + b;
        MathematicalOperation subtractionOperation = (int a, int b) -> a -b;
        MathematicalOperation randomOperation = (int a, int b) -> {
          if(a > b){
              return a + b;
          }else {
              return a - b;
          }
        };

        int output = additionOperation.operate(2, 10);
        int op2 = subtractionOperation.operate(15, 12);
        System.out.println(output);
        System.out.println(op2);

        //This was all about lambdas
        //Lambdas helps us in creating objects of functional interfaces - interfaces with only 1 method to be implemented

        /*
        Streams - like a pipeline
        Data(pipeline like thing is going to attached to that data)
        print all 1000 rows
        for(int .....) {
            if(i == 500){
                //499 rows
         */

        /*
        Streams does affect performance on positive side
        How ? - Streams internally maintains a complex tree like structure which makes the stream smart enough to optimize things
         */

        List<Integer> ls = List.of(5,4,3,2,8,9,6);
        Stream<Integer> s1 = ls.stream();
        Stream<Integer> s2 = ls.stream();
        System.out.println(s1); //s1 is stream reference
        //System.out.println(s1.limit(4)); //limit also is a stream reference
        System.out.println(s1.limit(5).count());
        //System.out.println(s2.limit(5).count());
        System.out.println(ls); //Streams doesn't affect the actual data source
        //Throws an error because stream has already been operated and closed
        /*
        Intermediate methods - returns the stream reference, for eg - limit
        Terminal methods - return the data, for eg - count, forEach
         */
        s2.forEach((elem) -> {
            System.out.println("element is " + elem);
        });

        //System.out.println(s2.limit(2).count());

        /*
        filter method
        sort
        reduce
         */

        //filter method
        List<Integer> ls2 = ls
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(ls2);

        //map method + sort method
        List<Integer> ls3 = ls
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x, y) -> { return y - x; })
                .collect(Collectors.toList());
        System.out.println(ls3);

        //findFirst() ,  reduce

        Optional<Integer> ls4 = ls
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x, y) -> { return y - x; })
                .findFirst();

        if(ls4.isPresent()){
            System.out.println(ls4.get());
        }

        //Reduce method - helps reduce multiple values into one
        Integer ls5 = ls
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x, y) -> { return y - x; })
                .reduce(0, (a,  b) -> {
                    return a + b;
                });
        System.out.println(ls5);

        Integer ans = 0;
        for(int i = 0 ; i < ls3.size() ; i++){
            ans += ls3.get(i);
        }

        Integer ls6 = ls
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x, y) -> { return y - x; })
                .reduce(Integer.MAX_VALUE, (cur_min,  elem) -> {
                    return Math.min(cur_min , elem);
                });

        Integer ans1 = Integer.MAX_VALUE;
        for(int i = 0 ; i < ls3.size() ; i++){
            ans1 = Math.max(ans1, ls3.get(i));
        }

        System.out.println(ls6);
        /*
        The order of stream methods is important and might affect the output
        because for the subsequent methods, the previous outputs becomes the inputs
         */
        /*
        Stream internally uses complex tree like DS to optimize the operations and hence helps in improving time and spce both
        If you really want to read -https://developer.ibm.com/series/java-streams/
         */
    }
}
