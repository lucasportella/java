package entities;

public class Triangle {
    public double lado1;
    public double lado2;
    public double lado3;
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2.0;
        System.out.println((p * (p - lado1) * (p - lado2) * (p - lado3)));
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

}
