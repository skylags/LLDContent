package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.login();
        i.userName = "umang_25";
        i.avgRating = 4.7;
        i.scheduleClass();
    }
}
