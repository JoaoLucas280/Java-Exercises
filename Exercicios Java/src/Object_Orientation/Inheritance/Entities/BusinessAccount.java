package Object_Orientation.Inheritance.Entities;

public class BusinessAccount extends Account{

    private Double loanLimit;


    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, Double balance, String holder, Double loanLimit) {
        super(number, balance, holder);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /*public void loan(double amount){
        if (amount <= loanLimit){    - sem o protected, esse método daria erro
            Deposit(amount);
        }
    }*/
    @Override
    public void Withdraw(Double amount){
        super.Withdraw(amount);
        balance -= 2.0;
    }
    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10;
        }
    }

}

