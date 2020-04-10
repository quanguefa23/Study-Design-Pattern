package FactoryAndPrototype;

import java.util.Date;

/**
 * BTC class extends CryptoCurrency
 */
public class BTC extends CryptoCurrency {
    public static final String fullName = "Bitcoin";

    public BTC(Date dOC, double price) {
        dateOfCreation = (Date) dOC.clone();
        currentPrice = price;
    }

    @Override
    public String identify() {
        return fullName + " (BTC) | " + dateOfCreation.toString() + " | " + currentPrice;
    }
}
