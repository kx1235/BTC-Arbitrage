package com.kenneth.exbtc.json;

public class quadAPI {
    private String timestamp;

    private String vwap;

    private String last;

    private String volume;

    private String high;

    private String ask;

    private String low;

    private String bid;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getVwap ()
    {
        return vwap;
    }

    public void setVwap (String vwap)
    {
        this.vwap = vwap;
    }

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public String getVolume ()
    {
        return volume;
    }

    public void setVolume (String volume)
    {
        this.volume = volume;
    }

    public String getHigh ()
    {
        return high;
    }

    public void setHigh (String high)
    {
        this.high = high;
    }

    public String getAsk ()
    {
        return ask;
    }

    public void setAsk (String ask)
    {
        this.ask = ask;
    }

    public String getLow ()
    {
        return low;
    }

    public void setLow (String low)
    {
        this.low = low;
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
        return "ClassPojo [timestamp = "+timestamp+", vwap = "+vwap+", last = "+last+", volume = "+volume+", high = "+high+", ask = "+ask+", low = "+low+", bid = "+bid+"]";
    }
}
