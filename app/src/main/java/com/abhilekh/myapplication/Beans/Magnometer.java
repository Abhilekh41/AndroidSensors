package com.abhilekh.myapplication.Beans;

public class Magnometer
{
    private Integer magnometerId =0;

    private Integer transactionId;

    private Float xValue;

    private Float yValue;

    private Float zValue;

    public Integer getMagnometerId() {
        return magnometerId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Float getxValue() {
        return xValue;
    }

    public void setxValue(Float xValue) {
        this.xValue = xValue;
    }

    public Float getyValue() {
        return yValue;
    }

    public void setyValue(Float yValue) {
        this.yValue = yValue;
    }

    public Float getzValue() {
        return zValue;
    }

    public void setzValue(Float zValue) {
        this.zValue = zValue;
    }

    public Magnometer(Integer transactionId, Float xValue, Float yValue, Float zValue) {
        this.magnometerId+=1;
        this.transactionId = transactionId;
        this.xValue = xValue;
        this.yValue = yValue;
        this.zValue = zValue;
    }
}
