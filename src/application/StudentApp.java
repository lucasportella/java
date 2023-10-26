package application;

import entities.Student;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert student data:");
        Student John = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        John.displayFinalResult();
        sc.close();
    }
}
