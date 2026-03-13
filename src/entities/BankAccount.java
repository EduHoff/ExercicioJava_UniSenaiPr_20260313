package entities;

public class BankAccount {
    private String holder;
    private double balance;

    public BankAccount(String holder, double initialDeposit) {
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saque negado!");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s | Saldo Atual: R$%.2f", holder, balance);
    }
}
