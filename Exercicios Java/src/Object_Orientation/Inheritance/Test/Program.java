package Object_Orientation.Inheritance.Test;


import Object_Orientation.Inheritance.Entities.Account;
import Object_Orientation.Inheritance.Entities.SavingsAccount;

public class Program {
    static void main() {

        Account x = new Account(1020, 1000.0, "João");
        Account y = new SavingsAccount(1023, 1000.0, "Maria", 0.01);
        x.Withdraw(50.0);
        y.Withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
