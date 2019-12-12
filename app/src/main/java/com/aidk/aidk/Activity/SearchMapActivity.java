package com.aidk.aidk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aidk.aidk.R;

import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBarUtils;
import fr.castorflex.android.smoothprogressbar.SmoothProgressDrawable;

public class SearchMapActivity extends BaseActivity {

    private SmoothProgressBar mPocketBar;
    private TextView mSearchtext;
    private SmoothProgressBar mProgressHorizontal;
    private LinearLayout mSearchConrainer;
    private LinearLayout mSearchConrainer1;
    private Button mCancle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aearch_map);
        forceRTLIfSupported();
        mPocketBar = findViewById(R.id.progress_horizontal);
        mPocketBar.setSmoothProgressDrawableBackgroundDrawable(SmoothProgressBarUtils.generateDrawableWithColors(getResources().getIntArray(R.array.pocket_background_colors),

                ((SmoothProgressDrawable) mPocketBar.getIndeterminateDrawable()).getStrokeWidth()));

        mPocketBar.progressiveStart();

        mSearchtext = findViewById(R.id.searchtext);
        mProgressHorizontal = findViewById(R.id.progress_horizontal);
        mSearchConrainer = findViewById(R.id.searchConrainer);
        mSearchConrainer1 = findViewById(R.id.searchConrainer1);

        mSearchConrainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSearchConrainer.setVisibility(View.GONE);
                mSearchConrainer1.setVisibility(View.VISIBLE);

            }
        });
        mCancle = findViewById(R.id.cancle);

        mCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSearchConrainer.setVisibility(View.VISIBLE);
                mSearchConrainer1.setVisibility(View.GONE);


            }
        });

    }
}
