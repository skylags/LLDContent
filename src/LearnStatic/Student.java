package LearnStatic;

import javax.swing.text.html.parser.TagElement;

public class Student {
    final static String univName = "Scaler"; //make it a foerver constant
    String name;
    int age;
    String gender;
    Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    static void attendClass(){
        System.out.println("Attending class");
    }
}
