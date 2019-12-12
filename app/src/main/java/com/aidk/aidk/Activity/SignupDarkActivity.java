package com.aidk.aidk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.aidk.aidk.R;

public class SignupDarkActivity extends BaseActivity {

    private ImageView mBack;
    private EditText mEeditUsername;
    private EditText mEditPassword;
    private EditText mRepeateEditPassword;
    private Button mSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_dark);
        forceRTLIfSupported();
        mBack = findViewById(R.id.back);
        mEeditUsername = findViewById(R.id.EeditUsername);
        mEditPassword = findViewById(R.id.EditPassword);
        mRepeateEditPassword = findViewById(R.id.RepeateEditPassword);
        mSignin = findViewById(R.id.Signin);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent VlounterrSigninActivity=new Intent(SignupDarkActivity.this, ChallengedIlliteracy.class);
                startActivity(VlounterrSigninActivity);
            }
        });

        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEeditUsername.getText().toString().equals(null) || mEeditUsername.getText().toString().equals("")){
                    Toast.makeText(SignupDarkActivity.this, ""+getString(R.string.mEeditUsername), Toast.LENGTH_SHORT).show();
                } else if(mEditPassword.getText().toString().equals(null) || mEditPassword.getText().toString().equals("")){
                    Toast.makeText(SignupDarkActivity.this, ""+getString(R.string.mEditPassword), Toast.LENGTH_SHORT).show();
                }
                else if(mRepeateEditPassword.getText().toString().equals(null) || mRepeateEditPassword.getText().toString().equals("")){
                    Toast.makeText(SignupDarkActivity.this, ""+getString(R.string.mEditREpPassword), Toast.LENGTH_SHORT).show();
                }

                else if(!mRepeateEditPassword.getText().toString().equals(mEditPassword.getText().toString())){
                    Toast.makeText(SignupDarkActivity.this, ""+getString(R.string.confirmPasswordNotMatchesPassword), Toast.LENGTH_SHORT).show();
                } else {
                    Intent ContionioSignupActivity=new Intent(SignupDarkActivity.this, ContionioSignupActivity.class);
                    startActivity(ContionioSignupActivity);


                }
            }
        });
    }
}
