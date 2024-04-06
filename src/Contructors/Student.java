package Contructors;

public class Student {
    String name;
    int age;
    int rollNo;
    String univName;
    double psp;


    Student(String name, double psp){
        this.name = name;
        this.psp = psp;
    }
    Student(){

    }
    /*
    Copy Constructor
     */
    Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
        this.univName = st.univName;
        this.rollNo = st.rollNo;
    }
}

/*
Constructors doesn't have return type
Name will be same as class name
Default constructor doesn't take any params
 */