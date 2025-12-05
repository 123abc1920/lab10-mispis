package src;

import java.util.Date;

public class ResearchPerson extends Employee {
    private Faculty faculty;

    public ResearchPerson(int socialNumber, String name, String email, Faculty faculty) {
        super(socialNumber, name, email);
        this.faculty = faculty;
    }

    public void createCourse(String name, int weeklyDuration, ResearchPerson lecturer) {
        faculty.courses.add(new Course(name, weeklyDuration, lecturer));
    }

    public void createProject(int hours, String name, Date startingDate, Date endDate) {
        faculty.projects.add(new Project(hours, name, startingDate, endDate));
    }

    public boolean inform() {
        return true;
    }

}