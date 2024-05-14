package Assingment02;

import java.util.Date;

public class Account {
    private String accountNumber;
    private  double balance;

    public  Account(String accountNumber,double balance,String fullName){
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public  void deposit(double amount){
        balance+=amount;
    }
    public  void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else
            System.out.println("insufficient ");
    }
    public double checkBalance(){
        return balance;
    }
}
