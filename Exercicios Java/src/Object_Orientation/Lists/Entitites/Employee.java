package Object_Orientation.Lists.Entitites;

public class Employee {

    private String name;
    private int ID;
    private double salary;
    private double add, reduce;

    public Employee(){
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void AddSalary(double percentage) {
        salary += salary * percentage / 100;
    }
    public void ReduceSalary(double percentage) {
        salary -= salary * percentage / 100;

    }

    public String toString(){
        return    "Dados: "
                + "Name: " + name + ", ID: " + ID + ", Salary: " + salary;
    }
}
