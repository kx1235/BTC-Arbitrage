

public class account {

    private double accountBalance;
    private double btcHolding;

    public account(double accountBalance, double btcHolding){
        this.accountBalance = accountBalance;
        this.btcHolding = btcHolding;
    }

    public void setAccountBalance(double newbalance){
        this.accountBalance = newbalance;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void setBtcHolding(double newholding){
        this.btcHolding = newholding;
    }

    public double getBtcHolding(){
        return btcHolding;
    }


}
