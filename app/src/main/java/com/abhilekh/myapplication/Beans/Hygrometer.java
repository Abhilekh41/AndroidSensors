package com.abhilekh.myapplication.Beans;

public class Hygrometer
{
    private static Integer hygrometerId = 0;

    private Integer transactionId;

    private Float reading;

    public Hygrometer(Integer transactionId, Float reading)
    {
        this.transactionId = transactionId;
        this.reading = reading;
    }

    public static Integer getHygrometerId() {
        return hygrometerId;
    }

    public static void setHygrometerId(Integer hygrometerId) {
        Hygrometer.hygrometerId = hygrometerId;
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
