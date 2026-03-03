package Object_Orientation.Contructors.Test;

import Object_Orientation.Contructors.Entities.Product2;

import java.util.Scanner;

public class Test_Product2 {


    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque os dados do produto: ");

        String name = input.nextLine();
        double price = input.nextDouble();


        Product2 product = new Product2(name, price);
        System.out.println(product);

        System.out.println("Quantos produtos serão adicionados? ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados Atualizados, número de produtos adicionados será: " + quantity);
        System.out.println(product);

        System.out.println("Quantos produtos serão removidos? ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println(product);


    }
}