package Contructors;

import methodoverriding.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {

    static void checkArrayLs(ArrayList<Integer> as){
        as.add(5);
        as = new ArrayList<>();
    }
    static void doSomething(Student st){
        st.name = "RTandoe";
        //Pass by value
        st = new Student("Vivek", 80);
    }
    public static void main(String[] args) {
        Student st1 = new Student("Umang", 90.5);
        st1.univName = "ABC";
        st1.rollNo = 60;
        st1.age = 24;

        doSomething(st1);
        ArrayList<Integer> as1 = new ArrayList<>();
        as1.add(10);
        as1.add(15);
        checkArrayLs(as1);


        //"Umang" -

        //Create a copy of st1 object having same value of attributes
        Student st2 = new Student(st1);
        //st2.name.concat("Agrawal");
        st2.name = "Kavya";
        //st2.name =



    }
}
/*
Client code needs to be as generic as possible
 */