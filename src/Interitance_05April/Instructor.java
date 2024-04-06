package Interitance_05April;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Instructor extends User{
    String activeBatch;
    double avgRating;
    String joiningDate;
    String type;
    void scheduleClass(){
        System.out.println("Instructor has scheduled a class");
    }
}


/*
extends - adds
keep the previous ones and add new ones
 */