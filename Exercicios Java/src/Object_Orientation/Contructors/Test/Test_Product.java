package Object_Orientation.Contructors.Test;

import Object_Orientation.Contructors.Entities.Product;

import java.util.Scanner;

public class Test_Product {


    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque os dados do produto: ");

        String name = input.nextLine();
        double price = input.nextDouble();
        int quantity = input.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println(product);

        System.out.println("Quantos produtos serão adicionados? ");
        quantity = input.nextInt();
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