package entities;

public class Produto {
public String name;
public double price;
public int quantity;

public double totalPrice () {
    return (double) price * quantity;
}

public void printProductData () {
    System.out.printf("Product data: %s, $%f, %d, Total %f", name, price, quantity, totalPrice());
}

public void incrementStockItem(int num) {
    quantity += num;
}
public void decrementStockItem(int num) {
    quantity -= num;
}

}
