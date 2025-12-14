package src;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int id;
    private Faculty faculty;

    private List<Course> courses = new ArrayList<>();

    public Student(String name, int id, Faculty faculty) {
        this.faculty = faculty;
        this.name = name;
        this.id = id;
    }

    public void takePartInCourse(Course course) {
        System.out.println("Студент " + this.name + " добавлен на курс " + course.name);
        this.courses.add(course);
    }

}