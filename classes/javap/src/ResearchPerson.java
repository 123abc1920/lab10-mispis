package src;

import java.util.Date;

public class ResearchPerson extends Employee {
    private Faculty faculty;

    public ResearchPerson(int socialNumber, String name, String email, Faculty faculty) {
        super(socialNumber, name, email);
        this.faculty = faculty;
    }

    public void createCourse(String name, int weeklyDuration, ResearchPerson lecturer) {
        Course c = new Course(name, weeklyDuration, lecturer);
        System.out.println("Преподаватель " + this.name + " создает курс " + c.name);
        faculty.courses.add(c);
    }

    public void createProject(int hours, String name, Date startingDate, Date endDate) {
        faculty.projects.add(new Project(hours, name, startingDate, endDate));
    }

    public boolean inform() {
        return true;
    }

}