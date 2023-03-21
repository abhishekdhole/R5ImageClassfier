package com.example.r5imageclassfier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.r5imageclassfier.helpers.ImageHelperActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onGotoImageActivity(View view){
        Intent intent = new Intent(this, ImageHelperActivity.class);
        startActivity(intent);
    }
}