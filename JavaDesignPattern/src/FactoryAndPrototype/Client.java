package FactoryAndPrototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //create a new wallet and add coin to it
        List<CryptoCurrency> wallet = new ArrayList<>();
        wallet.add(MiningPool.mine("BTC"));
        wallet.add(MiningPool.mine("Bitcoin"));
        wallet.add(MiningPool.mine("ETH"));
        wallet.add(MiningPool.mine("Ethereum"));
        wallet.add(MiningPool.mine("XRP"));
        wallet.add(MiningPool.mine("Ripple"));
        wallet.add(MiningPool.mine("EOS")); //invalid name, return null

        //show identity of all coin in my wallet
        for (CryptoCurrency crypto : wallet) {
            if (crypto != null)
                System.out.println(crypto.identify());
            else {
                System.out.println("Invalid Cryptocurrency");
            }
        }
    }
}
