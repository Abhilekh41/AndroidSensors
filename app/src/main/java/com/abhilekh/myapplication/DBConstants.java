package com.abhilekh.myapplication;


import android.provider.SyncStateContract;

public final class DBConstants
{

    private DBConstants()
    {

    }

    //DATABASE NAME
    public static final String DATABASE_NAME = "AndroidSensorData.db";


    //ACCELEROMETER TABLE
    public static final String ACCELEROMETER_TABLE_NAME = "Accelerometer_Table";

    public static final String ACCELEROMETER_COL_0 = "AccelerometerId";

    public static final String ACCELEROMETER_COL_1= "TransactionID";

    public static final String ACCELEROMETER_COL_2= "XValue";

    public static final String ACCELEROMETER_COL_3= "YValue";

    public static final String ACCELEROMETER_COL_4= "ZValue";

    public static final String ACCELEROMETER_COL_5 = "CREATE_DATE_TIME";

    //GRYOMETER TABLE
    public static final String GRYOMETER_TABLE_NAME = "Gyrometer_Table";

    public static final String GRYOMETER_COL_0 = "GryometerId";

    public static final String GRYOMETER_COL_1= "TransactionID";

    public static final String GRYOMETER_COL_2= "XValue";

    public static final String GRYOMETER_COL_3= "YValue";

    public static final String GRYOMETER_COL_4= "ZValue";

    public static final String GRYOMETER_COL_5 = "CREATE_DATE_TIME";


}
