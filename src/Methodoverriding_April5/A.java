package Methodoverriding_April5;

public class A {
    void doSomething(){ //dS()
        System.out.println("A's method is called");
    }

    void doSomething(String x){ //dS(String)
    }


}


/*
Name of the method(data type of params) = Method signature
One class can't have same method name as well as same method signature
same method name and diff signature -> MEthod overloading
 */