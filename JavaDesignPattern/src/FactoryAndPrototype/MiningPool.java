package FactoryAndPrototype;

import java.util.Date;
import java.util.HashMap;


public class MiningPool {
    public static final double BTC_CURRENT_PRICE = 6000;
    public static final double ETH_CURRENT_PRICE = 150;
    public static final double XRP_CURRENT_PRICE = 0.2;

    protected static HashMap<String, CryptoCurrency> prototypes;
    //this static block initializes the prototypes
    static {
        prototypes = new HashMap<>();
        CryptoCurrency btc = new BTC(new Date(), BTC_CURRENT_PRICE);
        CryptoCurrency eth = new ETH(new Date(), ETH_CURRENT_PRICE);
        CryptoCurrency xrp = new XRP(new Date(), XRP_CURRENT_PRICE);

        prototypes.put("Bitcoin", btc);
        prototypes.put("BTC", btc); //BTC and Bitcoin is the same coin
        prototypes.put("Ethereum", eth);
        prototypes.put("ETH", eth); //ETH and Ethereum is the same coin
        prototypes.put("Ripple", xrp);
        prototypes.put("XRP", xrp); // XRP and Ripple is the same coin
    }

    public static CryptoCurrency mine(String name) {
        try {
            //clone object from prototype, throws exception if the name does not exist in HashMap
            CryptoCurrency cryptoCurrency = prototypes.get(name).clone();

            //change other information
            cryptoCurrency.setDateOfCreation(new Date());

            return cryptoCurrency;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
