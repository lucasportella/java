package application;
import entities.Employee;
import java.util.Scanner;

public class EmployeeApp {
public static void main(String[] args) {
    Employee employee1 = new Employee("John", 3000.00, 200.00);
    employee1.PrintEmployee();
    Scanner sc = new Scanner(System.in);
    System.out.println("Which percentage to increase salary?");
    employee1.IncreaseSalary(sc.nextDouble());
    employee1.PrintEmployee();
    sc.close();
}
}
