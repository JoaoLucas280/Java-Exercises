package Object_Orientation.Inheritance.Entities;

public class Account {

    private Integer number;
    //private Double balance;
    protected Double balance;
    private String holder;

    public Account() {}

    public Account(Integer number, Double balance, String holder) {

        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void Withdraw(Double amount) {
        balance -= amount + 5.0;
    }
    public void  Deposit(Double amount) {
        balance += amount;
    }
}
