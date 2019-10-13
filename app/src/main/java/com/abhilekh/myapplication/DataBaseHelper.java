package com.abhilekh.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataBaseHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "AndroidSensorData.db";

    public static final String TABLE_NAME = "Accelerometer_Table";

    public static final String COL_0 = "AccelerometerId";

    public static final String COL_1= "TransactionID";

    public static final String COL_2= "XValue";

    public static final String COL_3= "YValue";

    public static final String COL_4= "ZValue";

    public static final String COL_5 = "CREATE_DATE_TIME";

    public DataBaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME+
                " (AccelerometerID INTEGER PRIMARY KEY AUTOINCREMENT, TransactionId LONG ," +
                " XValue DOUBLE , YValue DOUBLE , ZValue DOUBLE  , CREATE_DATE_TIME  DATETIME) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }

    public boolean insertData(String transactionId,String xValue, String yValue, String zValue)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mmm:ss");
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,transactionId);
        contentValues.put(COL_2,xValue);
        contentValues.put(COL_3,yValue);
        contentValues.put(COL_4,zValue);
        contentValues.put(COL_5,sdf.format(new Date()));

        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
        {
            return false;
        }
        else
            return true;
    }
}
