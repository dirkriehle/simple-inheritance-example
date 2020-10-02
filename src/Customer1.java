import java.util.LinkedList;
import java.util.List;

public class Customer1 {

    protected SavingsAccount savingsAccount = null;
    protected SalaryAccount salaryAccount = null;
    protected ForeignCurrencyAccount fxAccount = null;

    public double calcNetWorth() {
        double result = 0.0;
        result += savingsAccount.getBalanceInEuro();
        result += salaryAccount.getBalanceInEuro();
        result += fxAccount.getBalanceInEuro();
        return result;
    }

    public Customer1(SavingsAccount acc1, SalaryAccount acc2, ForeignCurrencyAccount acc3) {
        savingsAccount = acc1;
        salaryAccount = acc2;
        fxAccount = acc3;
    }

    public static void main(String argv[]) {
        Customer1 testCustomer = new Customer1(
                new SavingsAccount(100.0, 2.0),
                new SalaryAccount(0.0),
                new ForeignCurrencyAccount(10000.0, "USD")
        );

        double netWorth = testCustomer.calcNetWorth();
        System.out.println("Net worth = " + netWorth);
    }
}
