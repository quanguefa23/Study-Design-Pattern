package FactoryAndPrototype;

import java.util.Date;

/**
 * ETH class extends CryptoCurrency
 */
public class ETH extends CryptoCurrency{
    public static final String fullName = "Ethereum";

    public ETH(Date dOC, double price) {
        dateOfCreation = (Date) dOC.clone();
        currentPrice = price;
    }

    @Override
    public String identify() {
        return fullName + " (ETH) | " + dateOfCreation.toString() + " | " + currentPrice;
    }
}
