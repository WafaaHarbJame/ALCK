package com.aidk.aidk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.aidk.aidk.R;

public class SplashActivity extends BaseActivity {

    private Button mVlounter;
    private Button mChallengedIlliteracy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
        forceRTLIfSupported();


        mVlounter = findViewById(R.id.vlounter);
        mChallengedIlliteracy = findViewById(R.id.Challenged_illiteracy);
        mVlounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent VlounterrSigninActivity=new Intent(SplashActivity.this, ChallengedIlliteracy.class);
                startActivity(VlounterrSigninActivity);

            }
        });
        mChallengedIlliteracy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent VlounterrSigninActivity=new Intent(SplashActivity.this, VolunteerrActivity.class);
                startActivity(VlounterrSigninActivity);
            }
        });
    }


}
