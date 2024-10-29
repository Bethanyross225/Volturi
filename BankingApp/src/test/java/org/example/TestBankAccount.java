package org.example;
import org.junit.jupiter.api.Test;


public class TestBankAccount {
    BankAccount ba = new BankAccount(100,0,"Bob Fisher");
    CurrentAccount ca = new CurrentAccount(200, 0, "Fisher Bob", 80);
    CurrentAccount ca2 = new CurrentAccount(20, 0, "Fishy Bobby", 80);

    SavingsAccount sa = new SavingsAccount(100, 0, "Bobby Fishy");
    @Test
    public void TestWithdraw(){
        ba.Withdraw(50);
        assert ba.getBalance() == 50;
    }

    @Test
    public void TestDeposit(){
        ba.Deposit(70);
        assert ba.getBalance() == 170;
    }

    @Test
    public void TestAddInterest(){
        float resultBalance = sa.getBalance() * (1+sa.getInterest());
        sa.AddInterest();
        assert sa.getBalance() == resultBalance;
    }

    // Maximum withdraw
    @Test
    public void TestMaximumWithdrawFailure(){
        boolean result = ca.Withdraw(100);
        assert !result;
    }

    @Test
    public void TestMaximumWithdrawSuccess(){
        assert ca.Withdraw(50);
    }


    // Bank account
    @Test
    public void TestOverdraftWithdrawSuccess(){
        assert ca2.Withdraw(20);
    }

    @Test
    public void TestOverdraftWithdrawFailure(){
        assert !ca2.Withdraw(25);
    }




}
