package entities;

public class CurrencyConverter {

    public static double ConvertToBRL(double amount, double dollar) {
        return amount * dollar;
    }

    public static double CalculateIOF(double amount) {
        return amount + (amount * 0.06);
    }

    public static double ApplyConversion(double amount, double dollar) {
        return CalculateIOF(ConvertToBRL(amount, dollar));
    }
}
