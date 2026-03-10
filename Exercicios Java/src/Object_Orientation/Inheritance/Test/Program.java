package Object_Orientation.Inheritance.Test;

import Object_Orientation.Inheritance.Entities.BusinessAccount;

public class Program {
    static void main() {
        BusinessAccount account = new BusinessAccount();
        account.getBalance();
        account.getHolder();
    }
}
