package org.example;

public class SavingsAccount extends BankAccount{

    final float interestRate = 0.05F;
    public SavingsAccount(float balance, float minimumBalance, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
    }

    public void AddInterest(){
        balance *= 1 + interestRate;
    }

    public float getInterest(){
        return interestRate;
    }
}
