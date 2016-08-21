package com.musr.openitproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    Handler mHandler;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = (ImageView) findViewById(R.id.image_splash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_scale);
        imageView.startAnimation(animation);
        mHandler = new Handler(Looper.getMainLooper());
        moveMainActivity();
    }

    private void moveMainActivity() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        moveMainActivity();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
