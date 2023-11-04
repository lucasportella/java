package application;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide vector length: ");
        int vectorLength = sc.nextInt();
        double[] vector = new double[vectorLength];

        for (int c = 0; c < vectorLength; c++) {
            System.out.printf("Vector value for positon %d: ", c);
            vector[c] = sc.nextDouble();
        }
        System.out.print(Arrays.toString(vector));
    }
}
