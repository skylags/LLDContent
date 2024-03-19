package LambdasStreams;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        //return b.univName.compareTo(a.univName);
        //i want to sort based on id, but if two have same id, use psp
        if(a.id < b.id) {
            return -1;
        } else if(a.id > b.id){
            return 1;
        }else{
            if(a.psp < b.psp){
                return -1;
            }else return 1;
        }
    }
}
