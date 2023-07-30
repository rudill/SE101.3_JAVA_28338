//question 01
package com.mycompany.mainquestion01;
public class MainQuestion01 {
    public static void main(String[] args) {
        double checkingBalance = 1000000; // 1 million
        double savingBalance = 20000000; // 20 million

        CheckingAccount checkingAccount = new CheckingAccount("CHK12345", checkingBalance);
        SavingsAccount savingsAccount = new SavingsAccount("SAV67890", savingBalance);

        double checkingInterest = checkingAccount.calculateInterest();
        double savingInterest = savingsAccount.calculateInterest();

        System.out.println("Interest earned on Checking Account: $" + checkingInterest);
        System.out.println("Interest earned on Savings Account: $" + savingInterest);
    }
}