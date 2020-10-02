import java.util.LinkedList;
import java.util.List;

public class Customer2 {

    protected List<Account> accounts = new LinkedList<Account>();

    public double calcNetWorth() {
        double result = 0.0;

        for (Account acc : accounts) {
            result += acc.getBalanceInEuro();
        }

        return result;
    }

    public Customer2(SavingsAccount acc1, SalaryAccount acc2, ForeignCurrencyAccount acc3) {
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
    }

    public static void main(String argv[]) {
        Customer2 testCustomer = new Customer2(
                new SavingsAccount(100.0, 2.0),
                new SalaryAccount(0.0),
                new ForeignCurrencyAccount(10000.0, "USD")
        );

        double netWorth = testCustomer.calcNetWorth();
        System.out.println("Net worth = " + netWorth);
    }

}
