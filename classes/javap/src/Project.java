package src;

import java.util.Date;

public class Project {

    public int hours;
    public String name;
    public Date startingDate;
    public Date endDate;

    public Project(int hours, String name, Date startingDate, Date endDate) {
        this.name = name;
        this.hours = hours;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

}