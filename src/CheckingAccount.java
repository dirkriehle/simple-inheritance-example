public abstract class CheckingAccount extends Account {

    protected CheckingAccount() {
        super(0.0);
    }

    protected CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
}
