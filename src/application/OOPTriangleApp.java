package application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;
public class OOPTriangleApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.lado1 = sc.nextDouble();
        x.lado2 = sc.nextDouble();
        x.lado3 = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.lado1 = sc.nextDouble();
        y.lado2 = sc.nextDouble();
        y.lado3 = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }


}