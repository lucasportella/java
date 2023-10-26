// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 import java.util.Objects;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String repeat_string;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double temp = sc.nextDouble();
            System.out.println((9 * temp / 5) + 32);
            System.out.print("Deseja repetir (s/n)? ");
            repeat_string = sc.next();
            sc.close();
        } while (Objects.equals(repeat_string,"s") || Objects.equals(repeat_string, "sim"));
funcao("robert");
    }

    public static void funcao(String arg) {
        System.out.printf("Olá! %s", arg);
        return;
    }
}
