package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private Integer counter = 0;
    public static final String TAG = "StartActivity";
    private Integer count = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }

    @SuppressLint("SetTextI18n") // без этих шайтанских букв ругается на toString
    public void onClickBtnAddChinchilla(View view) {
        count ++;
        TextView counterView = findViewById(R.id.txtcounter);
        counterView.setText(count.toString());
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnAddChinchilla_mnogo(View view){
        count = count * 10;
        TextView counterView = findViewById(R.id.txtcounter);
        counterView.setText(count.toString());
    }
    @SuppressLint("SetTextI18n")
    public void onClickBtnReset(View view){
        count = 0;
        TextView counterView = findViewById(R.id.txtcounter);
        counterView.setText(count.toString());
    }
}