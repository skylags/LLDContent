package methodoverloading;

public class A {
    int doSomething(){
        System.out.println("Doing something 1");
        return 0;
    }
    String doSomething(int x){
        System.out.println("Doing something 2");
        return "";
    }
}
