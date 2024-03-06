package ConstructorChaining;

public class D extends C{
    D(String s){

        //before D() executes, it makes a call to parent's constructor
        //super = reference to parent's constructor
        super(s); //should the very first line
        System.out.println("Constructor of D");

    }
}
