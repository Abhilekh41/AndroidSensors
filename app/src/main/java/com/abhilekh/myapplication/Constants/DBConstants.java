package com.abhilekh.myapplication.Constants;

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
    public static final String GYROMETER_TABLE_NAME = "Gyrometer_Table";

    public static final String GYROMETER_COL_0 = "GryometerId";

    public static final String GYROMETER_COL_1= "TransactionID";

    public static final String GYROMETER_COL_2= "XValue";

    public static final String GYROMETER_COL_3= "YValue";

    public static final String GYROMETER_COL_4= "ZValue";

    public static final String GYROMETER_COL_5 = "CREATE_DATE_TIME";

    //MAGNOMETER
    public static final String MAGNOMETER_TABLE_NAME = "Magnometer_table";

    public static final String MAGNOMETER_COL_0 = "MagnometerId";

    public static final String MAGNOMETER_COL_1= "TransactionID";

    public static final String MAGNOMETER_COL_2= "XValue";

    public static final String MAGNOMETER_COL_3= "YValue";

    public static final String MAGNOMETER_COL_4= "ZValue";

    public static final String MAGNOMETER_COL_5 = "CREATE_DATE_TIME";

    //PHOTOMETER
    public static final String PHOTOMETER_TABLE_NAME = "Photometer_Table";

    public static final String PHOTOMETER_COL_O = "PhotometerId";

    public static final String PHOTOMETER_COL_1= "TransactionId";

    public static final String PHOTOMETER_COL_2 = "Reading";

    public static final String PHOTOMETER_COL_3 = "CREATE_DATE_TIME";

    //THERMOMETER
    public static final String THERMOMETER_TABLE_NAME = "Thermometer_Table";

    public static final String THERMOMETER_COL_0 = "ThermometerId";

    public static final String THERMOMETER_COL_1 = "TransactionId";

    public static final String THERMOMETER_COL_2 = "Reading";

    public static final String THERMOMETER_COL_3 = "CREATE_DATE_TIME";

    //BAROMETER
    public static final String BAROMETER_TABLE_NAME = "Barometer_Table";

    public static final String BAROMETER_COL_0 = "BarometerId";

    public static final String BAROMETER_COL_1 = "TransactionId";

    public static final String BAROMETER_COL_2 = "Reading";

    public static final String BAROMETER_COL_3 = "CREATE_DATE_TIME";

    //HYGROMETER
    public static final String HYGROMETER_TABLE_NAME = "Hygrometer_Table";

    public static final String HYGROMETER_COL_0 = "HygrometerId";

    public static final String HYGROMETER_COL_1 = "TransactionId";

    public static final String HYGROMETER_COL_2 = "Reading";

    public static final String HYGROMETER_COL_3 = "CREATE_DATE_TIME";

}
