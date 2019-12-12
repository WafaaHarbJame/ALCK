package com.aidk.aidk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aidk.aidk.R;

public class ChallengedIlliteracy extends BaseActivity {

    private EditText mEditEmail;
    private EditText mEditPassword;
    private Button mSignin;
    private TextView mCreatenewaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlounterr_signin);
        forceRTLIfSupported();


        mEditEmail = findViewById(R.id.EditEmail);
        mEditPassword = findViewById(R.id.EditPassword);
        mSignin = findViewById(R.id.Signin);
        mCreatenewaccount = findViewById(R.id.createnewaccount);
        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEditEmail.getText().equals(null) || mEditEmail.getText().equals("")){
                    Toast.makeText(ChallengedIlliteracy.this, ""+getString(R.string.mEditEmail), Toast.LENGTH_SHORT).show();
                } else if(mEditPassword.getText().equals(null) || mEditPassword.getText().equals("")){
                    Toast.makeText(ChallengedIlliteracy.this, ""+getString(R.string.mEditPassword), Toast.LENGTH_SHORT).show();
                }
                else if (!isEmailValid(mEditEmail.getText().toString())) {
                    Toast.makeText(ChallengedIlliteracy.this, getString(R.string.enter__correct_email), Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent searchMap=new Intent(ChallengedIlliteracy.this, SearchMapActivity.class);
                    startActivity(searchMap);


                }
            }
        });

        mCreatenewaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SignupDark=new Intent(ChallengedIlliteracy.this, SignupDarkActivity.class);
                startActivity(SignupDark);



            }
        });
    }
}
