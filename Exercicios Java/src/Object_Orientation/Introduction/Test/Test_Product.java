package Object_Orientation.Introduction.Test;
import Object_Orientation.Introduction.Entities.Product;
import java.util.Scanner;


public class Test_Product {
    static void main() {
        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Coloque os dados do produto: ");

        product.name = input.nextLine();
        product.price = input.nextDouble();
        product.quantity = input.nextInt();

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
