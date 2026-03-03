package Object_Orientation.Contructors.Test;

import Object_Orientation.Contructors.Entities.Bank_Account;

import  java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Test_Bank_Account {
    static void main() {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Bank_Account account;


        int accNumber = rand.nextInt(9999 - 1000 + 1) + 1000;
        System.out.println("Digite o nome do usuário: ");
        String name = input.next();

        System.out.println("Tem algum depósito inicial? s/n");
        char option = input.next().charAt(0);

        if (option == 's'){
            System.out.println("Coloque o valor do primeiro depósito: ");
            double initialDeposit = input.nextDouble();
            account = new Bank_Account(accNumber, name, initialDeposit);
        } else if (option == 'n') {
            account = new Bank_Account(accNumber, name);
        }else {
            System.out.println("Comando invalido");
            return;
        }
        System.out.println();
        System.out.println(account);

        System.out.println("Digite a quantia para depósito: ");
        double amount = input.nextDouble();
        account.deposit(amount);
        System.out.println(account);

        System.out.println();
        System.out.println("Digite a quantia para saque: ");
        amount = input.nextDouble();
        account.withdraw(amount);
        System.out.println(account);

    }
}
