package application;
import entities.Produto;
import java.util.Scanner;

public class DefineProductApp {
    public static void main(String[] args) {
    Produto produto1;
    Scanner sc = new Scanner(System.in);
    produto1 = new Produto();
    produto1.name = "arroz";
    produto1.quantity = 5;
    produto1.price = 2.00;
    produto1.printProductData();
    System.out.println();
    System.out.println("Increment stock: ");
    produto1.incrementStockItem(sc.nextInt());
    produto1.printProductData();
    System.out.println();
    System.out.println("Drecement stock: ");
    produto1.decrementStockItem(sc.nextInt());
    produto1.printProductData();
    sc.close();
    }
}
