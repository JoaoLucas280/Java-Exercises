package introducao.EstruturasSequenciais;
import java.util.Scanner;

public class codigo_de_pecas {
     static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        String code_product1, code_product_2;
        int amount_product1, amount_product2;
        float price_product1, price_product2, total;

        System.out.print("Digite o codigo do produto 1: ");
           code_product1 = input.nextLine();
        System.out.print("Digite o número de peças do produto 1: ");
            amount_product1 = input.nextInt();
        System.out.print("Digite o valor do produto 1: ");
             price_product1 = input.nextFloat();
             input.nextLine();

        System.out.print("Digite o codigo do produto 2: ");
            code_product_2 = input.nextLine();
        System.out.print("Digite o número de peças do produto 2: ");
            amount_product2 = input.nextInt();
        System.out.print("Digite o valor do produto 2: ");
            price_product2 = input.nextFloat();

        total = (amount_product1 * price_product1) + (amount_product2 * price_product2);

        System.out.println("=====================");
        System.out.println("VOCÊ ESTÁ COMPRANDO " + amount_product1 + " DE PRODUTO 1, CÓDIGO: " + code_product1);
        System.out.println("E " + amount_product2 + " DE PRODUTO 2, CÓDIGO : " + code_product_2);
        System.out.printf("O TOTAL É: R$ %.2f%n", total);
        System.out.println("=====================");









    }
}
