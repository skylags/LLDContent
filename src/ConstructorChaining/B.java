package ConstructorChaining;

public class B extends A{
    B(String s){
        super(s);
        System.out.println("Constructor of B");
    }
}
