package com.hmcoding.meet5task1animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    Animation am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am= AnimationUtils.loadAnimation(MainActivity.this, R.anim.geor);
    }

    public void rot(View view) {
        view.startAnimation(am);
    }
}