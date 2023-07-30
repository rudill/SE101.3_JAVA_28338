package com.mycompany.mainquestion01;
class CheckingAccount extends BankAccount 
{
    private static final double INTEREST_RATE = 0.02;

    public CheckingAccount(String accountNumber, double balance) 
    {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return getBalance() * INTEREST_RATE;
    }
}