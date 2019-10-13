package com.abhilekh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;

    private Sensor accelerometerSensor;

    private Sensor gyrometerSensor;

    private Sensor magnetometerSensor;

    private Sensor barometerSensor;

    private Sensor photometerSensor;

    private Sensor hygrometerSensor;

    private Sensor thermometerSensor;

    DataBaseHelper dataBaseHelper;

    private static final String TAG = "MainActivity";

    //Accelerometer
    TextView xAccelerometerValue,yAccelerometerValue,zAccelerometerValue;

    //Gyrometer
    TextView xGyrometerValue,yGyrometerValue,zGyrometerValue;

    //Magnetometer
    TextView xMagnetometerValue,yMagnetometerValue,zMagnetometerValye;

    //Barometer
    TextView barometerValue;

    //Photometer
    TextView photometerValue;

    //Thermometer
    TextView thermometerValue;

    //Hygrometer
    TextView hygrometerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseHelper = new DataBaseHelper(this);

        xAccelerometerValue = findViewById(R.id.xAccelerometerValue);
        yAccelerometerValue = findViewById(R.id.yAccelerometerValue);
        zAccelerometerValue = findViewById(R.id.zAccelerometerValue);


        xGyrometerValue = findViewById(R.id.xGyrometerValue);
        yGyrometerValue = findViewById(R.id.yGyrometerValue);
        zGyrometerValue = findViewById(R.id.zGyrometerValue);


        xMagnetometerValue = findViewById(R.id.xMagnometerValue);
        yMagnetometerValue = findViewById(R.id.yMagnometerValue);
        zMagnetometerValye = findViewById(R.id.zMagnometerValue);

        photometerValue =  findViewById(R.id.photometerValue);
        barometerValue = findViewById(R.id.barometerValue);
        thermometerValue = findViewById(R.id.thermometerValue);
        hygrometerValue = findViewById(R.id.hygrometerValue);

        Log.d(TAG, "onCreate: Initializing Sensor Services");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if(accelerometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,accelerometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Accelerometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Accelerometer is not supported");
            xAccelerometerValue.setText("Accelerometer is not supported");
            yAccelerometerValue.setText("Accelerometer is not supported");
            zAccelerometerValue.setText("Accelerometer is not supported");
        }


        gyrometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if(gyrometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,gyrometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Gyrometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Gyrometer is not supported on your device");
            xGyrometerValue.setText("Gyrometer is not supported on your device");
            yGyrometerValue.setText("Gyrometer is not supported on your device");
            zGyrometerValue.setText("Gyrometer is not supported on your device");
        }

        magnetometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        if(magnetometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,magnetometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Magetometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Magetometer is not supported on your device");
            xMagnetometerValue.setText("Magetometer is not supported on your device");
            yMagnetometerValue.setText("Magetometer is not supported on your device");
            zMagnetometerValye.setText("Magetometer is not supported on your device");
        }

        barometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        if(barometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,barometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Barometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Barometer is not supported on your device");
            barometerValue.setText("Barometer is not supported on your device");
        }

        photometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if(photometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,photometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Photometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Photometer is not supported on your device");
            photometerValue.setText("Photometer is not supported on your device");
        }

        thermometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        if(thermometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,thermometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Thermometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Thermometer is not supported on your device");
            thermometerValue.setText("Thermometer is not supported on your device");
        }

        hygrometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY);
        if(hygrometerSensor!=null)
        {
            sensorManager.registerListener(MainActivity.this,hygrometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Hygrometer registered successfully");
        }
        else
        {
            Log.d(TAG, "onCreate: Hygrometer is not supported on your device");
            hygrometerValue.setText("Hygrometer is not supported on your device");
        }

        Log.d(TAG, "onCreate: Sensor Registration Done");
     }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
       Sensor sensor = sensorEvent.sensor;
       Integer transactionid = 0;
       if(sensor.getType() == Sensor.TYPE_ACCELEROMETER)
       {
           transactionid = transactionid +1;
           Log.d(TAG, "onSensorChanged:  X : "+sensorEvent.values[0]+
                   " Y : "+sensorEvent.values[1]+
                   " Z : "+sensorEvent.values[2]);
           xAccelerometerValue.setText("Accelerometer's X Co-ordinate : "+sensorEvent.values[0]);
           yAccelerometerValue.setText("Accelerometer's Y Co-ordinate : "+sensorEvent.values[1]);
           zAccelerometerValue.setText("Accelerometer's Z Co-ordinate : "+sensorEvent.values[2]);

           boolean result =  dataBaseHelper.insertData(transactionid.toString(),
                   String.valueOf(sensorEvent.values[0]),
                   String.valueOf(sensorEvent.values[1]),
                   String.valueOf(sensorEvent.values[2]));

           Log.d(TAG, "Accelerometer DB Insertion :" +result);

       }
       else if(sensor.getType() == Sensor.TYPE_GYROSCOPE)
       {
           Log.d(TAG, "onSensorChanged:  X : "+sensorEvent.values[0]+
                   " Y : "+sensorEvent.values[1]+
                   " Z : "+sensorEvent.values[2]);
           xGyrometerValue.setText("GyroMeter's X Co-ordinate : "+sensorEvent.values[0]);
           yGyrometerValue.setText("GyroMeter's Y Co-ordinate : "+sensorEvent.values[1]);
           zGyrometerValue.setText("GyroMeter's Z Co-ordinate : "+sensorEvent.values[2]);
       }

       else if(sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
       {
           Log.d(TAG, "onSensorChanged:  X : "+sensorEvent.values[0]+
                   " Y : "+sensorEvent.values[1]+
                   " Z : "+sensorEvent.values[2]);
           xMagnetometerValue.setText("Magnometer's X Co-ordinate : "+sensorEvent.values[0]);
           yMagnetometerValue.setText("Magnometer's Y Co-ordinate : "+sensorEvent.values[1]);
           zMagnetometerValye.setText("Magnometer's Z Co-ordinate : "+sensorEvent.values[2]);
       }

       else if(sensor.getType() == Sensor.TYPE_RELATIVE_HUMIDITY)
       {
           Log.d(TAG, "onSensorChanged:  Hygrometer : "+sensorEvent.values[0]);
           hygrometerValue.setText("Humidity : "+sensorEvent.values[0]);
       }

       else if(sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE)
       {
           Log.d(TAG, "onSensorChanged:  Thermometer : "+sensorEvent.values[0]);
           thermometerValue.setText("Temperature : "+sensorEvent.values[0]);
       }

       else if(sensor.getType() == Sensor.TYPE_LIGHT)
       {
           Log.d(TAG, "onSensorChanged:  Photometer : "+sensorEvent.values[0]);
           photometerValue.setText("Light Intensity : "+sensorEvent.values[0]);
       }

       else if(sensor.getType() == Sensor.TYPE_PRESSURE)
       {
           Log.d(TAG, "onSensorChanged:  Barometer : "+sensorEvent.values[0]);
           barometerValue.setText("Pressure : "+sensorEvent.values[0]);
       }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i)
    {

    }
}
