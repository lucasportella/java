package application;

import entities.Person;

import java.util.Arrays;
import java.util.Scanner;
import utils.HeightUtils;

public class HeightProblem {
 public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("How many people will be added? ");
     int n = sc.nextInt();
     Person[] personVector = new Person[n];
     for (int c = 0; c < n; c++) {System.out.printf("Data of the %dº person:\n",c + 1);
         System.out.print("Name: ");
         String name = sc.nextLine();
         sc.nextLine();
         System.out.print("Age: ");
         int age = sc.nextInt();
         System.out.print("Height: ");
         double height = sc.nextDouble();
         Person person = new Person(name, age, height);
         personVector[c] = person;
     }

     System.out.print(Arrays.toString(personVector));
     System.out.printf("Minors percentage: %.2f", HeightUtils.calculateMinorsPercentage(personVector));
 }
}
