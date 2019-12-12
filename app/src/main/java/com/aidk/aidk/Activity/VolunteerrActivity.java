package com.aidk.aidk.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.aidk.aidk.R;

public class VolunteerrActivity extends BaseActivity {
    private EditText mEditUsername;
    private EditText mEditPassword;
    private Button mSignin;
    private TextView mCreatenewaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteerr);
        forceRTLIfSupported();


        mEditUsername = findViewById(R.id.EditUsername);
        mEditPassword = findViewById(R.id.EditPassword);
        mSignin = findViewById(R.id.Signin);
        mCreatenewaccount = findViewById(R.id.createnewaccount);
        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEditUsername.getText().toString().equals(null) ||
                        mEditUsername.getText().toString().equals("")){
                    Toast.makeText(VolunteerrActivity.this, ""+getString(R.string.mEeditUsername), Toast.LENGTH_SHORT).show();
                } else if(mEditPassword.getText().toString().equals(null) || mEditPassword.getText().toString().equals("")){
                    Toast.makeText(VolunteerrActivity.this, ""+getString(R.string.mEditPassword), Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent MapActivity=new Intent(VolunteerrActivity.this, PlaceVolunteerActivity.class);
                    startActivity(MapActivity);



                }
            }
        });

        mCreatenewaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SignupDark=new Intent(VolunteerrActivity.this, SignUpVolunteer.class);
                startActivity(SignupDark);



            }
        });
    }
}
