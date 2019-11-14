package com.abhilekh.myapplication.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.abhilekh.myapplication.Beans.Accelerometer;
import com.abhilekh.myapplication.Beans.Barometer;
import com.abhilekh.myapplication.Beans.Gyrometer;
import com.abhilekh.myapplication.Beans.Hygrometer;
import com.abhilekh.myapplication.Beans.Magnometer;
import com.abhilekh.myapplication.Beans.Photometer;
import com.abhilekh.myapplication.Beans.Thermometer;
import com.abhilekh.myapplication.Constants.DBConstants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatabaseHelper extends SQLiteOpenHelper
{

    private static final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context)
    {
        super(context,DBConstants.DATABASE_NAME,null,6);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("CREATE TABLE "+ DBConstants.GYROMETER_TABLE_NAME+
                " (GyrometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " XValue DOUBLE , YValue DOUBLE , ZValue DOUBLE  , CREATE_DATE_TIME  DATETIME) ");

        sqLiteDatabase.execSQL("CREATE TABLE "+DBConstants.ACCELEROMETER_TABLE_NAME+
                " (AccelerometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " XValue DOUBLE , YValue DOUBLE , ZValue DOUBLE  , CREATE_DATE_TIME  DATETIME) ");

        sqLiteDatabase.execSQL("CREATE TABLE "+DBConstants.MAGNOMETER_TABLE_NAME+
                " (MagnometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " XValue DOUBLE , YValue DOUBLE , ZValue DOUBLE  , CREATE_DATE_TIME  DATETIME) ");

        sqLiteDatabase.execSQL("CREATE TABLE "+DBConstants.PHOTOMETER_TABLE_NAME+
                " (PhotometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " Reading DOUBLE , CREATE_DATE_TIME  DATETIME) ");

        sqLiteDatabase.execSQL("CREATE TABLE "+DBConstants.THERMOMETER_TABLE_NAME+
                " (PhotometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " Reading DOUBLE , CREATE_DATE_TIME  DATETIME) ");

        sqLiteDatabase.execSQL("CREATE TABLE "+DBConstants.HYGROMETER_TABLE_NAME+
                " (HygrometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " Reading DOUBLE , CREATE_DATE_TIME  DATETIME) ");

        sqLiteDatabase.execSQL("CREATE TABLE "+DBConstants.BAROMETER_TABLE_NAME+
                " (BarometerId INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " Reading DOUBLE , CREATE_DATE_TIME  DATETIME) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.ACCELEROMETER_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.GYROMETER_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.MAGNOMETER_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.THERMOMETER_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.BAROMETER_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.PHOTOMETER_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBConstants.HYGROMETER_TABLE_NAME);

    }

    public boolean insertAccelerometerData(Accelerometer accelerometer)
    {

        Log.d(TAG, "insertAccelerometerData: Inside inserAccelerometer");
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.ACCELEROMETER_COL_1, accelerometer.getTransactionId());
        contentValues.put(DBConstants.ACCELEROMETER_COL_2, accelerometer.getxValue());
        contentValues.put(DBConstants.ACCELEROMETER_COL_3, accelerometer.getyValue());
        contentValues.put(DBConstants.ACCELEROMETER_COL_4, accelerometer.getzValue());
        contentValues.put(DBConstants.ACCELEROMETER_COL_5, sdf.format(new Date()));

        long result = db.insert(DBConstants.ACCELEROMETER_TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else
            return true;

    }

    public boolean insertGyrometerData(Gyrometer gyrometer)
    {

        Log.d(TAG, "insertGyrometerData: Inside insertGryometer ");
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.GYROMETER_COL_1, gyrometer.getTransactionId());
        contentValues.put(DBConstants.GYROMETER_COL_2, gyrometer.getxValue());
        contentValues.put(DBConstants.GYROMETER_COL_3, gyrometer.getyValue());
        contentValues.put(DBConstants.GYROMETER_COL_4, gyrometer.getzValue());
        contentValues.put(DBConstants.GYROMETER_COL_5, sdf.format(new Date()));

        long result = db.insert(DBConstants.GYROMETER_TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else
            return true;

    }


    public boolean insertMagnometerData(Magnometer magnometer)
    {

        Log.d(TAG, "insertMagnometerData: Inside insertMagnometer");
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.MAGNOMETER_COL_1, magnometer.getTransactionId());
        contentValues.put(DBConstants.MAGNOMETER_COL_2, magnometer.getxValue());
        contentValues.put(DBConstants.MAGNOMETER_COL_3, magnometer.getyValue());
        contentValues.put(DBConstants.MAGNOMETER_COL_4, magnometer.getzValue());
        contentValues.put(DBConstants.MAGNOMETER_COL_5, sdf.format(new Date()));

        long result = db.insert(DBConstants.MAGNOMETER_TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else
            return true;

    }

    public boolean insertPhotometerData(Photometer photometer) {

        Log.d(TAG, "insertPhotometerData: Inside insertPhotometerData");
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.PHOTOMETER_COL_1, photometer.getTransactionId());
        contentValues.put(DBConstants.PHOTOMETER_COL_2, photometer.getReading());
        contentValues.put(DBConstants.PHOTOMETER_COL_3, sdf.format(new Date()));

        long result = db.insert(DBConstants.PHOTOMETER_TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else
            return true;

    }


    public boolean insertThermometerData(Thermometer thermometer)
    {
        Log.d(TAG, "insertThermometerData : Inside insertThermometerData");
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.THERMOMETER_COL_1, thermometer.getTransactionId());
        contentValues.put(DBConstants.THERMOMETER_COL_2, thermometer.getReading());
        contentValues.put(DBConstants.THERMOMETER_COL_3, sdf.format(new Date()));

        long result = db.insert(DBConstants.THERMOMETER_TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else
            return true;

    }

    public boolean insertHygrometerData(Hygrometer hygrometer)
    {
        Log.d(TAG, "insertHygrometerData : Inside insertHygrometerData");
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.HYGROMETER_COL_1, hygrometer.getTransactionId());
        contentValues.put(DBConstants.HYGROMETER_COL_2, hygrometer.getReading());
        contentValues.put(DBConstants.HYGROMETER_COL_3, sdf.format(new Date()));

        long result = db.insert(DBConstants.HYGROMETER_TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else
            return true;
    }

    public boolean insertBarometerData(Barometer barometer)
    {
        Log.d(TAG, "insertBarometerData : Inside insertBarometerData");

        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBConstants.BAROMETER_COL_1, barometer.getTransactionId());
        contentValues.put(DBConstants.BAROMETER_COL_2, barometer.getReading());
        contentValues.put(DBConstants.BAROMETER_COL_3, sdf.format(new Date()));

        long result = db.insert(DBConstants.BAROMETER_TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else
            return true;

    }


}
