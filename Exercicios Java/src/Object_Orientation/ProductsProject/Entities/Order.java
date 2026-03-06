package Object_Orientation.ProductsProject.Entities;

import Object_Orientation.Enumeration.Entities_enums.OrderStatus;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    List<OrderItem> items = new ArrayList<>();
    private static final DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Horário do pedido: ");
        sb.append(sdf.parse((CharSequence) moment) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(client + "\n");
        sb.append("Pedir itens:\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
