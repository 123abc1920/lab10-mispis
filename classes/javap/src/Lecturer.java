package src;

public class Lecturer extends ResearchPerson {

    public Lecturer(int socialNumber, String name, String email, Faculty faculty) {
        super(socialNumber, name, email, faculty);
    }

    public void createCourse(String name, int weeklyDuration) {
        super.createCourse(name, weeklyDuration, this);
    }

}