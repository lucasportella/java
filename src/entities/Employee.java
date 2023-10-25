package entities;

public class Employee {
    String name;
    Double grossSalary;
    Double tax;

    public Employee(String name, Double grossSalary, Double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    public double NetSalary() {
        return this.grossSalary - this.tax;
    }
    public void IncreaseSalary(double percentage) {
        this.grossSalary = this.grossSalary + this.grossSalary * (percentage / 100);
    }

    public void PrintEmployee() {
        System.out.printf("Name: %s\nNet Salary: %.2f\n", name, NetSalary());
    }
}
