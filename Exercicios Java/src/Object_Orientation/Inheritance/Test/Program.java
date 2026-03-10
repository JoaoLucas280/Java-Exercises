package Object_Orientation.Inheritance.Test;

import Object_Orientation.Inheritance.Entities.Account;
import Object_Orientation.Inheritance.Entities.BusinessAccount;
import Object_Orientation.Inheritance.Entities.SavingsAccount;

public class Program {
    static void main() {
        BusinessAccount example = new BusinessAccount();
        example.getBalance();
        example.getHolder();

        Account account = new Account(10, 0.0, "Joao" );
        BusinessAccount busAcc = new BusinessAccount(5, 500.0, "Maria", 500.0);

        //UPCASTING

        Account acc = busAcc;
        Account acc1 = new BusinessAccount(9, 1000.0, "Alex", 2000.0);
        Account acc2 = new SavingsAccount(100, 3000.0, "Ana", 0.01);

        //DOWNCASTING

        BusinessAccount acc3 = (BusinessAccount) acc1;

        //BusinessAccount acc4 = (BusinessAccount) acc2; acc2 não é business account.

        if (acc2 instanceof BusinessAccount) {
            BusinessAccount busAcc5 = (BusinessAccount) acc2;
            busAcc5.loan(200.0);
            System.out.println("Done Loan!");

        }
    }
}
