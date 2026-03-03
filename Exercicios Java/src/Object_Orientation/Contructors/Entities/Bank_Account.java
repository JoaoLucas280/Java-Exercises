package Object_Orientation.Contructors.Entities;

import org.w3c.dom.ls.LSOutput;

public class Bank_Account {
    private int accNumber;
    private String name;
    private double balance;

    public Bank_Account() {
    }

    public Bank_Account(int accNumber, String name) {
        this.accNumber = accNumber;
        this.name = name;
    }

    public Bank_Account(int accNumber, String name, double initialDeposit) {
        this.accNumber = accNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount - 5;
    }

    public String toString() {
       return  "Dados da Conta: "
                + accNumber
                +"| Nome: "
                + name
                +"| Balança: "
                + String.format("%.2f", balance);


    }



}
