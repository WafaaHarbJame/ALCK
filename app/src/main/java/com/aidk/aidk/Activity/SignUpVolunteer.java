package com.aidk.aidk.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.aidk.aidk.R;

public class SignUpVolunteer extends BaseActivity {
    private ImageView mBack;
    private EditText mEeditUsername;
    private EditText mEditPassword;
    private EditText mphone;
    private Button mSignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_volunteer);
        mBack = findViewById(R.id.back);
        mEeditUsername = findViewById(R.id.EeditUsername);
        mEditPassword = findViewById(R.id.EditPassword);
        mphone = findViewById(R.id.phone);
        mSignin = findViewById(R.id.Signin);
        forceRTLIfSupported();
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent VlounterrSigninActivity=new Intent(SignUpVolunteer.this, VolunteerrActivity.class);
                startActivity(VlounterrSigninActivity);
            }
        });

        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEeditUsername.getText().toString().equals(null) || mEeditUsername.getText().toString().equals("")){
                    Toast.makeText(SignUpVolunteer.this, ""+getString(R.string.mEeditUsername), Toast.LENGTH_SHORT).show();
                } else if(mEditPassword.getText().toString().equals(null) || mEditPassword.getText().toString().equals("")){
                    Toast.makeText(SignUpVolunteer.this, ""+getString(R.string.mEditPassword), Toast.LENGTH_SHORT).show();
                }
                else if(mphone.getText().toString().equals(null) || mphone.getText().toString().equals("")){
                    Toast.makeText(SignUpVolunteer.this, ""+getString(R.string.phone), Toast.LENGTH_SHORT).show();
                }

               else {
                    Intent ContionioSignupActivity=new Intent(SignUpVolunteer.this, PlaceVolunteerActivity.class);
                    startActivity(ContionioSignupActivity);


                }
            }
        });
    }
}
