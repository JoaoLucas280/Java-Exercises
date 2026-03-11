package Object_Orientation.Polymorphism.entities;

public class OutsourcedEmployee extends Employee {

    private double additionalCharge;

    public OutsourcedEmployee() {}

    public OutsourcedEmployee(String name, double salaryPerHour, Integer hours, double additionalCharge){
        super(name, salaryPerHour, hours);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double totalSalary(){
        return super.totalSalary() + additionalCharge * 1.10;
    }


}
