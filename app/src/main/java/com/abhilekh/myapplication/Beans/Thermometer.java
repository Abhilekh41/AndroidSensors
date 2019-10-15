package com.abhilekh.myapplication.Beans;

public class Thermometer
{
    private static Integer thermometerId = 0;

    private Integer transactionId;

    private Float reading;

    public Thermometer(Integer transactionId, Float reading)
    {
        this.transactionId = transactionId;
        this.thermometerId = +1;
        this.reading = reading;
    }

    public static Integer getThermometerId() {
        return thermometerId;
    }

    public static void setThermometerId(Integer thermometerId) {
        Thermometer.thermometerId = thermometerId;
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
