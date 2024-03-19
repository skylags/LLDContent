package LambdasStreams;


import LearnThreads.HelloWorldPrint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    }
}
