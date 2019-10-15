package com.abhilekh.myapplication.Beans;

public class Photometer
{
    private static Integer photometerId = 0;

    private Integer transactionId;

    private Float reading;

    public Photometer(Integer transactionId, Float reading)
    {
        this.transactionId = transactionId;
        this.photometerId = +1;
        this.reading = reading;
    }

    public Integer getPhotometerId() {
        return photometerId;
    }

    public void setPhotometerId(Integer photometerId) {
        this.photometerId = photometerId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Float getReading() {
        return reading;
    }

    public void setReading(Float reading) {
        this.reading = reading;
    }
}
