package Object_Orientation.ProductsProject.Entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;


    public Product(){}
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
}
