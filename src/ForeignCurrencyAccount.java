public class ForeignCurrencyAccount extends CheckingAccount {

    protected String currency = "USD";

    public double getBalanceInEuro() {
        double conversionRate = getConversionRateToEuro(currency);
        return balance * conversionRate;
    }

    public double getConversionRateToEuro(String fromCurrency) {
        return 1.20; // for demonstration purposes only
    }

    public ForeignCurrencyAccount(double initialBalance, String thisCurrency) {
        super(initialBalance);
        currency = thisCurrency;
    }
}
