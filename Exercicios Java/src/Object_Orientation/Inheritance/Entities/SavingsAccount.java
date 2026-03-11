package Object_Orientation.Inheritance.Entities;

public class SavingsAccount extends Account {

    private double InterestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, Double balance, String holder, double interestRate) {
        super(number, balance, holder);
        this.InterestRate = interestRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance *  InterestRate; //mais uma vez somente dando certo com o "protected da varável balance"
    }

    @Override
    public void Withdraw(Double amount) {
        balance -= amount;
    }
}
