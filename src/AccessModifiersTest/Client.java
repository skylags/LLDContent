package AccessModifiersTest;

import OtherPackage.Student;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        //st1.name = "Naman"; // private
        //st1.batch_id;
        // st1.psp = 90;
        st1.universityName = "XYZ";
    }

}
