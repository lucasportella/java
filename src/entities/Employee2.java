package entities;

public class Employee2 {
    int id;
    String name;
    double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent) {
        this.salary = this.salary + (this.salary * percent / 100);
    }
}