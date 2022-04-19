package models;

public class Employee extends Person{
    public static int counter = 0;
    private float salary;

    public float getSalary() {
        return salary;
    }

    public Employee(String name, String lastName,  float salary) {
        counter++;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setSalary(float salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }
}
