package org.example;

public class BankAccount {
    public float getBalance() {
        return balance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setMinimumBalance(float minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    float balance;
    float minimumBalance;
    String accountHolderName;

    public void Deposit(float amount){
        this.setBalance(balance+amount);
    }

    public boolean Withdraw(float amount){
        this.setBalance(balance-amount);
        return true;
    }

    public BankAccount(float balance, float minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

}
