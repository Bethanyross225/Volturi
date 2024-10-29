package org.example;
import org.junit.jupiter.api.Test;


public class TestBankAccount {
    BankAccount ba = new BankAccount(100,0,"Bob Fisher");

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
        float resultBalance = sa.getBalance() * sa.getInterest();
        sa.AddInterest();
        assert sa.getBalance() == resultBalance;
    }

    @Test
    public void TestMaximumWithdrawFailure(){
        boolean result = ca.WithDraw(100);
        assert !result;
    }

    @Test
    public void TestMaximumWithdrawSuccess(){
        assert ca.WithDraw(50);
    }

    @Test
    public void TestOverdraftWithdrawSuccess(){
        assert ca2.WithDraw(20);
    }

    @Test
    public void TestOverdraftWithdrawFailure(){
        assert !ca2.WithDraw(25);
    }




}
