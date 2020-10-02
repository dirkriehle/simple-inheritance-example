public abstract class Account {

    protected double balance = 0.0;

    public double getBalanceInEuro() {
        return balance;
    }

    public synchronized void deposit(double amount) { balance += amount; }

    public synchronized void withdraw(double amount) { balance -= amount; }

    protected Account(double initialBalance) { balance = initialBalance; }

    protected Account() { }
}
