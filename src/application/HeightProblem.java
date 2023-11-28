package application;

import entities.Person;
import java.util.Scanner;
import utils.HeightUtils;

public class HeightProblem {
 public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("How many people will be added? ");
     int n = sc.nextInt();
     sc.nextLine(); // Consume the newline character
     Person[] personVector = new Person[n];
     for (int c = 0; c < n; c++) {System.out.printf("Data of the %dº person:\n",c + 1);
         System.out.print("Name: ");
         String name = sc.nextLine().trim();
         System.out.print("Age: ");
         int age = sc.nextInt();
         System.out.print("Height: ");
         double height = sc.nextDouble();
         sc.nextLine(); // Consume the newline character
         Person person = new Person(name, age, height);
         personVector[c] = person;
     }
     sc.close();
    for (int c =0; c < personVector.length; c++) {
        System.out.println(personVector[c].toString() );
    }
     System.out.printf("Minors percentage: %.2f%%\n", HeightUtils.calculateMinorsPercentage(personVector));
     System.out.printf("Average height: %.2f", HeightUtils.calculateAverageHeight(personVector));
 }

}
