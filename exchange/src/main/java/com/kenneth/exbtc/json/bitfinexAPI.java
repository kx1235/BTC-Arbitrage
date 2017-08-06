package com.kenneth.exbtc.json;

public class bitfinexAPI {
    private String timestamp;

    private String volume;

    private String last_price;

    private String high;

    private String mid;

    private String low;

    private String ask;

    private String bid;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getVolume ()
    {
        return volume;
    }

    public void setVolume (String volume)
    {
        this.volume = volume;
    }

    public String getLast_price ()
    {
        return last_price;
    }

    public void setLast_price (String last_price)
    {
        this.last_price = last_price;
    }

    public String getHigh ()
    {
        return high;
    }

    public void setHigh (String high)
    {
        this.high = high;
    }

    public String getMid ()
    {
        return mid;
    }

    public void setMid (String mid)
    {
        this.mid = mid;
    }

    public String getLow ()
    {
        return low;
    }

    public void setLow (String low)
    {
        this.low = low;
    }

    public String getAsk ()
    {
        return ask;
    }

    public void setAsk (String ask)
    {
        this.ask = ask;
    }

    public String getBid ()
    {
        return bid;
    }

    public void setBid (String bid)
    {
        this.bid = bid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", volume = "+volume+", last_price = "+last_price+", high = "+high+", mid = "+mid+", low = "+low+", ask = "+ask+", bid = "+bid+"]";
    }

}
