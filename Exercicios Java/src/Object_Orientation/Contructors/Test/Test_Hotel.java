package Object_Orientation.Contructors.Test;


import Object_Orientation.Contructors.Entities.Hotel;

import java.util.Scanner;

public class Test_Hotel {
    public static void main(String[] args) {
        Hotel[] hotel = new Hotel[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos quartos foram alugados: ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println("Alugado #" + i + ": ");
            System.out.print("Nome: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto: ");
            int roomNumber = input.nextInt();
            hotel[roomNumber] = new Hotel(name, email);
            System.out.println();
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (hotel[i] != null) {
                System.out.println(i + ": " + hotel[i]);


            }
        }

    }
}