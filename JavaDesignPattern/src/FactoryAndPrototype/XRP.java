package FactoryAndPrototype;

import java.util.Date;

/**
 * XRP class extends CryptoCurrency
 */
public class XRP extends CryptoCurrency{
    public static final String fullName = "Ripple";

    public XRP(Date dOC, double price) {
        dateOfCreation = (Date) dOC.clone();
        currentPrice = price;
    }

    @Override
    public String identify() {
        return fullName + " (XRP) | " + dateOfCreation.toString() + " | " + currentPrice;
    }
}
