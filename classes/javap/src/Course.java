package src;

import java.util.Random;

public class Course {

    public int uniqueNumber;
    public String name;
    public int weeklyDuration;

    private ResearchPerson lecturer;

    public Course(String name, int weeklyDuration, ResearchPerson lecturer) {
        this.name = name;
        this.weeklyDuration = weeklyDuration;
        this.uniqueNumber = new Random().nextInt();

        this.lecturer = lecturer;
    }

    public boolean informLecturer(){
        return this.lecturer.inform();
    }

}