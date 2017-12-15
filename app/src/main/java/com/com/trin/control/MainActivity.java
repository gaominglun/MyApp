package com.com.trin.control;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("trin","开始第一条线程");

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("trin","开始第二条线程");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("trin","开始第三条线程");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {


                Log.i("trin","开始第四条线程");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("trin","开始第五条线程");
            }
        }).start();
    }

}
