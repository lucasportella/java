package entities;

public class Banking {
    private final Integer accountNumber;
    private String ownerName;
    private Double balance = 0.00;


    public Banking(Integer accountNumber, String ownerName, Double initialDeposit) {
        super();
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        deposit(initialDeposit);
    }

    public Banking(Integer accountNumber, String ownerName) {
        super();
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public void deposit(Double value) {
        this.balance = balance + value;
    }

    public void withdraw(Double value) {
        Double withdrawTax = 5.00;
        this.balance = balance - value - withdrawTax;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void displayAccountData() {
        System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f\n", this.accountNumber, this.ownerName, this.balance);
    }

    public void displayUpdatedAccountData() {
        System.out.printf("Updated account data:\nAccount %d, Holder: %s, Balance: $ %.2f\n", this.accountNumber, this.ownerName, this.balance);
    }

}
