package src;

public class Institute {

    public String name;
    public String address;

    private Employee[] employees;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setEmploees(Employee... empl) {
        this.employees = empl;
    }

    public int getEmploeesCount() {
        if (this.employees != null) {
            return this.employees.length;
        } else {
            return 0;
        }
    }

}