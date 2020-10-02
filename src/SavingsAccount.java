public class SavingsAccount extends Account {

    protected double interestRate = 0.0;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public synchronized void applyInterest() {
        double interest = balance * interestRate;
        deposit(interest);
    }

    public SavingsAccount() {
        super(0.0);
        interestRate = 0.0;
    }

    public SavingsAccount(double initialBalance, double initialInterestRate) {
        super(initialBalance);
        interestRate = initialInterestRate;
    }
}
