package Exceptions;

import java.sql.SQLException;

public class Student {
    public int findStudentByRollNo(int rollNo) throws ClassNotFoundException, EvenNumberException {
        //return 10;
        if(rollNo < 30){
            //System.out.println("roll no is less than 30");
            throw  new ClassNotFoundException();
            //throw new IndexOutOfBoundsException();
        }else if(rollNo % 2 == 0){
            throw new EvenNumberException();
        } else if(rollNo % 2 != 0){
            throw new OddNumberException();
        }
        return 1/1;
    }

    public int doSomething(int rollNo) throws SQLException{
        try {
            if (rollNo < 30) {
                System.out.println("roll no is less than 30");
                throw new ClassNotFoundException();
                //throw new IndexOutOfBoundsException();
            } else if (rollNo % 2 == 0) {
                throw new EvenNumberException();
            } else if (rollNo % 2 != 0) {
                throw new OddNumberException();
            } else {
                throw new SQLException();
            }
        }
        catch(ClassNotFoundException ex1){


        } catch(EvenNumberException ex2){

        } catch(OddNumberException ex3){

        }
        return 1;
    }
}

/*
All checked exceptions needs to be added in throws of called function
 */
/*
Runtime exceptions = unchecked exceptions - RT
checked exceptions - CT
 */

/*
a -> b -> c -> d
which should be catched first??
d is the root parent
a should be catched first
D d = new A()/B()/C()/D()
order of catching exceptions should be from bottom to top
 */