package Constructor_Chaining_05April;

public class D extends C{
    D(){
        //first D() will make a call to C()
        super("Anurag");

        System.out.println("Constructor of D is called");
    }
}
/*
Here we are not calling parent's constructor explicity
but if we want to do that - we can use super()
 */
/*
super needs to be only in the first line of the constructor
 */