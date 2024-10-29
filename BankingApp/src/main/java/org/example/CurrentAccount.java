package org.example;

public class CurrentAccount extends BankAccount{

    float maximumWithDrawAmount = 20;

    public CurrentAccount(float balance, float minimumBalance, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
    }

    public CurrentAccount(float balance, float minimumBalance, String accountHolderName, float maximumWithDrawAmount) {
        super(balance, minimumBalance, accountHolderName);
        this.maximumWithDrawAmount = maximumWithDrawAmount;
    }

    @Override
    public boolean Withdraw(float amount){
        if (amount > maximumWithDrawAmount || amount > balance){
            return false;
        }
        setBalance(balance-amount);
        return true;
    }
}
