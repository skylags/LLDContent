package LearnStatic;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student("Pravalika", 29, "Female");
        Student s2 = new Student("Karhikey", 39, "Male");
        System.out.println(s1.univName);
        System.out.println(s2.univName);
        System.out.println(Student.univName);
        Student.attendClass();
        //s1.univName = "InterviewBit";
        //Student.univName = "SST";
    }
}
