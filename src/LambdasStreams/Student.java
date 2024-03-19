package LambdasStreams;

public class Student implements Comparable<Student>{
    int id;
    double psp;
    String univName;
    Student(int id, double psp, String univName){
        this.id = id;
        this.psp = psp;
        this.univName = univName;
    }

    //for defining the natural ordering
    //a.compareTo(b)
    @Override
    public int compareTo(Student student) {
        //a = this.x, b = student.x
        if(this.id < student.id) {
            return -1;
        } else if(student.id < this.id){
            return 1;
        } else return 0;
    }
}
