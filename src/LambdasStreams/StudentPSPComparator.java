package LambdasStreams;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.psp < b.psp){
            return -1;
        }else return 1;
    }
}
