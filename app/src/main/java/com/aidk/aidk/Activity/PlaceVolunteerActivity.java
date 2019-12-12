package com.aidk.aidk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aidk.aidk.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PlaceVolunteerActivity extends BaseActivity implements OnMapReadyCallback {
    private TextView mSearchtext;
    private LinearLayout mSearchConrainer;
    private ImageView mProgressHorizontal;
    private LinearLayout mSearchConrainer1;
    private LinearLayout mSearchConrainer2;
    private Button mCancle;
    private TextView mDistance;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_volunteer);
        forceRTLIfSupported();
        mSearchtext = findViewById(R.id.searchtext);
        mSearchConrainer = findViewById(R.id.searchConrainer);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mProgressHorizontal = findViewById(R.id.progress_horizontal);
        mSearchtext = findViewById(R.id.searchtext);
        mDistance = findViewById(R.id.distance);
        mCancle = findViewById(R.id.cancle);
        mSearchConrainer = findViewById(R.id.searchConrainer);
        mSearchConrainer1 = findViewById(R.id.searchConrainer1);
        mSearchConrainer2=findViewById(R.id.searchConrainer2);
        mSearchtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSearchConrainer.setVisibility(View.GONE);
                mSearchConrainer1.setVisibility(View.VISIBLE);


                /*Intent intent = new Intent(PlaceVolunteerActivity.this, VolunteerMapActivity.class);
                startActivity(intent);*/

            }
        });



        mSearchConrainer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSearchConrainer.setVisibility(View.GONE);
                mSearchConrainer1.setVisibility(View.GONE);
                mSearchConrainer2.setVisibility(View.VISIBLE);

            }
        });
        mSearchConrainer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCancle.setText("قابلت أحمد");
                mCancle.setEnabled(false);
                mDistance.setText("على بعد 1 دقائق منك");
            }
        });
        mCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSearchConrainer1.setVisibility(View.GONE);
                mSearchConrainer2.setVisibility(View.GONE);
                mSearchConrainer.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
      //  LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.getMaxZoomLevel();
        mMap.getMaxZoomLevel();
    }
}
