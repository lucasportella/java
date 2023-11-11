package application;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        while (n < 0) {
        System.out.print("Número inválido. Por favor, digite um número inteiro acima de 0: ");
        n = sc.nextInt();
        }
        int[] numbers = new int[n];
        for (int c = 0; c < numbers.length; c++) {
            System.out.print("Digite um número: ");
            numbers[c] = sc.nextInt();
        }

        boolean hasNegative = false;
        for (int c = 0; c < numbers.length; c++) {
            if (numbers[c] < 0) {
                if (!hasNegative) {
                    System.out.println("NÚMEROS NEGATIVOS: ");
                }
                hasNegative = true;
                System.out.println(numbers[c]);
            }
        }
        if (!hasNegative) {
            System.out.print("Nenhum número negativo encontrado.");
        }
    }
}
