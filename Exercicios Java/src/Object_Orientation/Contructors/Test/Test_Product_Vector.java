package Object_Orientation.Contructors.Test;

import Object_Orientation.Contructors.Entities.Product_Vector;

import  java.util.Scanner;

public class Test_Product_Vector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos: ");
        int n = input.nextInt();

        Product_Vector[] pv = new Product_Vector[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do produto: ");
            String name = input.next();
            System.out.println("Digite o preço do produto: ");
            double price = input.nextDouble();
            pv[i] = new Product_Vector(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += pv[i].getPrice();
        }
        double avg = sum / n;
        System.out.println(avg);

    }
}
