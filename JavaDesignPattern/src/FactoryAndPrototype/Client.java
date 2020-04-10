package FactoryAndPrototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        MiningPool miningPool = new MiningPool();

        //create a new wallet and add coin to it
        List<CryptoCurrency> wallet = new ArrayList<>();
        wallet.add(miningPool.mine("BTC"));
        wallet.add(miningPool.mine("Bitcoin"));
        wallet.add(miningPool.mine("ETH"));
        wallet.add(miningPool.mine("Ethereum"));
        wallet.add(miningPool.mine("XRP"));
        wallet.add(miningPool.mine("Ripple"));
        wallet.add(miningPool.mine("EOS")); //invalid name, return null

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
