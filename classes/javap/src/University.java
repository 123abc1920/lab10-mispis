package src;

public class University {
    private String name;

    private Faculty[] facultyList;

    public University(String name) {
        this.name = name;
    }

    public void setFaculty(Faculty... faculty) {
        this.facultyList=faculty;
    }
}