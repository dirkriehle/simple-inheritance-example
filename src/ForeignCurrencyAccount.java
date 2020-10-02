import java.util.Map;
import java.util.HashMap;

public class ForeignCurrencyAccount extends CheckingAccount {

    protected String currency = "USD";
    protected Map<String, Double> conversionRateToEuro = new HashMap<>();

    public double getBalanceInEuro() {
        double conversionRate = getConversionRateToEuro(currency);
        return balance * conversionRate;
    }

    public double getConversionRateToEuro(String fromCurrency) {
        Double result = conversionRateToEuro.get(fromCurrency);
        if (result == null) { result = 1.0; }
        return result;
    }

    public ForeignCurrencyAccount(double initialBalance, String thisCurrency) {
        super(initialBalance);
        currency = thisCurrency;
        conversionRateToEuro.put("USD", 1 / 1.2);
    }
}
