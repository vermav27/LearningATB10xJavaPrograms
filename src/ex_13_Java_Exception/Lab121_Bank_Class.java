package ex_13_Java_Exception;

public class Lab121_Bank_Class {
    private String currency;
    private int amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer add ( Lab121_Bank_Class B1){

        //Here we are creating our own exception for which we use throw keyword

        if(B1.currency.equalsIgnoreCase("INR")){
            return B1.amount + this.amount;
        }else {
            try {
                throw new Exception("Currency Mismatch Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return 0;
        }
    }

    public Lab121_Bank_Class(int amount_c, String currency_c) {
        this.amount = amount_c;
        this.currency = currency_c;
    }
}
