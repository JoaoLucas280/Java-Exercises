package Object_Orientation.Inheritance.Test;


import Object_Orientation.Inheritance.Entities.Account;
import Object_Orientation.Inheritance.Entities.BusinessAccount;
import Object_Orientation.Inheritance.Entities.SavingsAccount;

public class Program {
    static void main() {

        Account acc1 = new Account(200, 500.0, "Alex");
        acc1.Withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(200, 500.0, "Maria", 0.01);
        acc2.Withdraw(200.0);
        System.out.println(acc2.getBalance()); // o @Override do Savings Account não deixa o 5.0 de taxa

        Account acc3 = new BusinessAccount(200, 500.0, "Joao", 1000.0);
        acc3.Withdraw(200.0);
        System.out.println(acc3.getBalance()); //Utiliza o mesmo método da super classe Account e sobrepôe com o -= 2.0
    }
}
