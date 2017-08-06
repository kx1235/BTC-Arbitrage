
import com.google.gson.Gson;
import com.kenneth.exbtc.json.bitfinexAPI;
import com.kenneth.exbtc.json.bitstampAPI;
import com.kenneth.exbtc.json.quadAPI;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class marketData {

    private static OkHttpClient client = new OkHttpClient();
    /*public static void main(String[] args) throws InterruptedException , SocketTimeoutException{
        int counter = 0;
        boolean infinite = true;
        while (infinite) {
            System.out.println("BITSTAMP DATA");
            for (String str : getBTCbitstamp()) {
                System.out.println(str);
            }
            System.out.println("BITFINEX DATA");
            for (String str : getBTCbitfinex()) {
                System.out.println(str);
            }
            System.out.println("QUADRIGACX DATA");
            for (String str: getBTCquad()){
                System.out.println(str);
            }

            System.out.println("End of " + counter + " Second");
            counter = counter + 1;
            Thread.sleep(1000);
        }
    }*/


    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    //makes url request to get json formatted data
    public static String getBTCbitstamp(){
        String jsonBitstamp = null;
        try {
            jsonBitstamp = getJSON("https://www.bitstamp.net/api/ticker/");
        }
        catch(Exception e){
            e.printStackTrace();
        }
//makes new gson file
        Gson gsonBitstamp = new Gson();
        bitstampAPI bitstampapi = gsonBitstamp.fromJson(jsonBitstamp,bitstampAPI.class);
// returns the variables from json file
        return bitstampapi.getLast();
    }





    public static String getBTCbitfinex(){
        String jsonBitfinex = null;
        try{
            jsonBitfinex = getJSON("https://api.bitfinex.com/v1//pubticker/btcusd");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Gson gsonBitfinex = new Gson();
        bitfinexAPI bitfinexapi = gsonBitfinex.fromJson(jsonBitfinex,bitfinexAPI.class);

        return bitfinexapi.getLast_price();

    }


    public static String getBTCquad(){
        String jsonQuad = null;
        try{
            jsonQuad = getJSON("https://api.quadrigacx.com/v2/ticker");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Gson gsonQuad = new Gson();
        quadAPI quadapi = gsonQuad.fromJson(jsonQuad,quadAPI.class);
        return quadapi.getLast();

    }


}
