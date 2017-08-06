import java.math.BigDecimal;
import java.text.DecimalFormat;

public class algo {

// return market data
    public static String getBitstampData(){
        marketData bitstampData = new marketData();
        String storeBitsamp = bitstampData.getBTCbitstamp();
        return storeBitsamp;
    }

    public static String getBitfinexData(){
        marketData bitfinex = new marketData();
        String storeBitfinex = bitfinex.getBTCbitfinex();
        return storeBitfinex;
    }

    public static String getQuadData(){
        marketData quadData = new marketData();
        String storeQuad = quadData.getBTCquad();
        return storeQuad;
    }
//transform market data from string to double value
    double bitstampPrice = Double.parseDouble(getBitstampData());
    double bitfinexPrice = Double.parseDouble(getBitfinexData());
    double quadPrice = Double.parseDouble(getQuadData());

    double lowPrice;
    double lowCad;
//determines the lowest price b/w bitstamp and bitfinex
    public double minPrice(){
        if(bitstampPrice > bitfinexPrice){
            lowPrice = bitfinexPrice;
        }
        else{
            lowPrice = bitstampPrice;
        }
        return lowPrice;
    }
//converts lowest USD exchange price to canadian dollars
    public double toCad(){
        lowCad = minPrice()*1.25;
        return lowCad;
    }

//creating initial account balance
     account accountUSD = new account(2000.00,0.00);
     double btcBought;

//method to buy bitcoins.
     public double buy(){
         double btcBuy = accountUSD.getAccountBalance()/toCad();
         accountUSD.setAccountBalance(0);
         btcBought = Math.round(btcBuy*1000000.0)/1000000.0;
         return btcBought;
     }
//method to sell bitcoins
     double newBalance;
     public double sell(){
         double sellNewBalance = accountUSD.getBtcHolding()*quadPrice;
         accountUSD.setBtcHolding(0);
         newBalance = Math.round(sellNewBalance*1000000.0)/1000000.0;
         return newBalance;
     }

    public void decision(){
         if((quadPrice/toCad()) >= 1.01){
             buy();
             accountUSD.setBtcHolding(btcBought);
             sell();
             accountUSD.setAccountBalance(newBalance);

             double roundBalance = Math.round(accountUSD.getAccountBalance()*1000000.0)/1000000.0;
             double roundBtcHolding = Math.round(accountUSD.getBtcHolding()*1000000.0)/1000000.0;

             System.out.println("Current Account Balance " + roundBalance);
             System.out.println("Current BtcBalance " + roundBtcHolding);
         }
         else{
             System.out.println("No arbitrage Oppurtunity");
         }
    }

    double finalBalance = accountUSD.getAccountBalance();
    double finalBtcholding = accountUSD.getBtcHolding();
//prints market data
    public static void main(String[] args) throws InterruptedException{
        System.out.println(getBitstampData());
        System.out.println(getBitfinexData());
        System.out.println(getQuadData());

        algo test = new algo();
        boolean inifite = true;
        while (inifite){
            test.decision();
            Thread.sleep(1000);
        }




    }








}
