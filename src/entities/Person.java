package entities;

public class Person {
    public String name;
    public int age;
    public double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Height: " + this.height;
    }


}
