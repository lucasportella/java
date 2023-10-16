package application;

import java.util.Scanner;

public class ProceduralTriangleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as medidas do triângulo: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("A área do triângulo é %f", calculateTriangleArea(a,b,c));
        sc.close();
    }
    public static double calculateTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p -c));
    }
}
