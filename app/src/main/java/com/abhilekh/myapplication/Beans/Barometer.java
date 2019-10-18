package com.abhilekh.myapplication.Beans;

public class Barometer
{
    private static Integer barometerId = 0;

    private Integer transactionId;

    private Float reading;

    public static Integer getBarometerId() {
        return barometerId;
    }

    public static void setBarometerId(Integer barometerId) {
        Barometer.barometerId = barometerId;
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
