package com.mycompany.mainquestion01;
class SavingsAccount extends BankAccount 
{
    private static final double INTEREST_RATE = 0.12;

    public SavingsAccount(String accountNumber, double balance) 
    {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return getBalance() * INTEREST_RATE;
    }
}