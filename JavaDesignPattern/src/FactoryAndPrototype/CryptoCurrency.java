package FactoryAndPrototype;

import java.util.Date;

/**
 * Abstract class chung cho tất cả các loại CryptoCurrency, implements Cloneable để có thể thực hiện tạo prototype
 */
public abstract class CryptoCurrency implements Cloneable{
    Date dateOfCreation;
    double currentPrice;

    public CryptoCurrency clone() {
        try {
            return (CryptoCurrency) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    //this method is aim to change other information of an instance after clone
    public void setDateOfCreation(Date date) {
        dateOfCreation = date;
    }

    //return identify-string of an instance (includes full name, date of creation and current price)
    public abstract String identify();
}
