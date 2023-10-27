package application;
import java.util.Scanner;
import entities.CurrencyConverter;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price?");
        double dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        System.out.printf("Amount to be paid in BRL = %.2f",CurrencyConverter.ApplyConversion(sc.nextDouble(), dollar));
        sc.close();
    }
}
