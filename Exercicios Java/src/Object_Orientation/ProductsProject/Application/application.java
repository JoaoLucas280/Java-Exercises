package Object_Orientation.ProductsProject.Application;

import Object_Orientation.Enumeration.Entities_enums.OrderStatus;
import Object_Orientation.ProductsProject.Entities.Client;
import Object_Orientation.ProductsProject.Entities.Order;
import Object_Orientation.ProductsProject.Entities.OrderItem;
import Object_Orientation.ProductsProject.Entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class application {

    static void main() throws ParseException{



            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Digite os dados do cliente:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Data de nascimento (DD/MM/YYYY): ");
            Date birthDate = sdf.parse(sc.next());

            Client client = new Client(name, email, birthDate);

            System.out.println("Digite os dados do pedido:");
            System.out.print("Status: ");
            OrderStatus status = OrderStatus.valueOf(sc.next());

            Order order = new Order(new Date(), status, client);

            System.out.print("Digite a quantidade de itens: ");
            int n = sc.nextInt();
            for (int i=1; i<=n; i++) {
                System.out.println("Digite #" + i + " dados do produto:");
                System.out.print("Nome do produto: ");
                sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Preço do produto: ");
                double productPrice = sc.nextDouble();

                Product product = new Product(productName, productPrice);

                System.out.print("Quantidade: ");
                int quantity = sc.nextInt();

                OrderItem orderItem = new OrderItem(quantity, productPrice, product);

                order.addItem(orderItem);
            }

            System.out.println();
            System.out.println("Resumo do pedido:");
            System.out.println(order);

        }
    }

