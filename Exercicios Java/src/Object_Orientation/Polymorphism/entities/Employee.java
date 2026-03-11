package Object_Orientation.Polymorphism.entities;

public class Employee {

    private String name;
    private double salaryPerHour;
    private Integer hours;

    public Employee(){}

    public Employee(String name, double salaryPerHour, Integer hours) {

        this.name = name;
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalSalary() {
        return salaryPerHour * hours;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salaryPerHour + ", Hours: " + hours + ", Total salary: " + totalSalary();
    }
}
