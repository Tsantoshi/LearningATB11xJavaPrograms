package ex_30_Exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankname) {
        if (bankname.currency.equals("INR")) {
            return bankname.amount + this.amount;
        } else {
            try {
                throw new CurrencyMisMatchCustomException("currency mismatch");

            } catch (CurrencyMisMatchCustomException e) {

                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}

class CurrencyMisMatchCustomException extends Exception{

    CurrencyMisMatchCustomException(String msg){
        super(msg);
    }
}

class NotValidAgeException extends Exception{
    NotValidAgeException(String e){
        super(e);
    }
}

