package Exceptions;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException{
        Student st1 = new Student();

        try{
            st1.findStudentByRollNo(10);
        }
        catch (ClassNotFoundException ex1){
            System.out.println("ClassNot Found exception has come");
            //throw new ClassNotFoundException();
        }catch (EvenNumberException ex2){
            System.out.println("Even No exception has come");
        } catch (OddNumberException ex3){
            System.out.println("OddNo exception has come");
        } catch(RuntimeException ex4){
            System.out.println("Handling Run time exceptions");
        } finally { //will be definately be executed after try/catch
            System.out.println("I am in finally block, things are fine");
        }
        //finally is written to be executed irrespective of what happens
        //mainly finally is used to cleanup things

        System.out.println("I am outside try/catch block, things are fine");

        try{
            int op = st1.doSomething(50);
        } catch(SQLException ex){
            //i might try to re-establish the connection
            //i might again doSomething
        }

    }
}


/*
Checked exception - You'll have to give a disclaimer
Runtime exception - Disclaimer is not mandatory
It's not even expected to run into these exceptions (RT)
 */