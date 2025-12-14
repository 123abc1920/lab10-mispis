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

        System.out.println("Создан факультет " + this.name.toString() + " по адресу " + this.address);
    }

    public void setInstitute(Institute... institute) {
        this.instituteList = institute;

        int count = 0;

        for (int i = 0; i < this.instituteList.length; i++) {
            count += this.instituteList[i].getEmploeesCount();
        }

        this.numberOfEmployers = count;

        System.out.println("На факультет " + this.name + " добавлены кафедры:");

        for (Institute i : this.instituteList) {
            System.out.print(i.name.toString() + " ");
        }
        System.out.println();
    }

}