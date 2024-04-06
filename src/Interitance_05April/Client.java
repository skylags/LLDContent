package Interitance_05April;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.login();
        i.name = "Umang";
        i.userName = "skylags";
        i.avgRating = 4.88;
        i.age = 24;
        i.activeBatch = "July23";
        i.scheduleClass();
    }
}
