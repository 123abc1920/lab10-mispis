package src;

public class Employee {

    public int socialSecurityNumber;
    public String name;
    public String email;

    public Employee(int socialNumber, String name, String email) {
        this.socialSecurityNumber = socialNumber;
        this.name = name;
        this.email = email;

        System.out.println("Добавлен работник "+this.name.toString()+" с почтой "+this.email);
    }

}