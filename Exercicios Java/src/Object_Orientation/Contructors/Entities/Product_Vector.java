package Object_Orientation.Contructors.Entities;

public class Product_Vector {
    private String name;
    private double price;

    public Product_Vector() {}

    public Product_Vector(String name, double price) {
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

    public void setPrice(double price) {
        this.price = price;
    }

}
