package Assingment02;

public class Main {
    public static void main(String[] args) {
        Account myacc=new Account("232",1000,"Ali");
        System.out.println(myacc.checkBalance());
        myacc.deposit(500);
        myacc.withdraw(200);
        System.out.println("the account balance: "+myacc.checkBalance());

        SavingAccount SAC=new SavingAccount("4444",200,"Ali Abdi");
        SAC.deposit(0);
        SAC.withdraw(210);
       
        System.out.println("Saving Account balace: "+SAC.checkBalance());


    }
}