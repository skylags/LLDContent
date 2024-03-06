package OtherPackage;

public class StudentChild extends Student{
    public static void main(String[] args) {
        //all attributes of parent class are extended to child class
        StudentChild st = new StudentChild();
        //st.name = "jkl";
        st.batch_id = 5;
        st.universityName = "jkl";
        st.psp = 90;
    }
}
