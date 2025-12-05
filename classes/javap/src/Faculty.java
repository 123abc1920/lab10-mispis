package src;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    public String name;
    public String address;
    public int numberOfEmployers;

    private Institute[] instituteList;
    public List<Project> projects = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();

    public Faculty(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setInstitute(Institute... institute) {
        this.instituteList = institute;

        int count = 0;

        for (int i = 0; i < this.instituteList.length; i++) {
            count += this.instituteList[i].getEmploeesCount();
        }

        this.numberOfEmployers = count;
    }

}