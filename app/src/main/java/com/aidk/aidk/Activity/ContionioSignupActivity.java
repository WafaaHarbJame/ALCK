package com.aidk.aidk.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.LinearLayoutCompat;

import com.aidk.aidk.R;
import com.vansuita.pickimage.bean.PickResult;
import com.vansuita.pickimage.bundle.PickSetup;
import com.vansuita.pickimage.dialog.PickImageDialog;
import com.vansuita.pickimage.enums.EPickType;
import com.vansuita.pickimage.listeners.IPickCancel;
import com.vansuita.pickimage.listeners.IPickResult;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContionioSignupActivity extends BaseActivity implements  IPickResult{

    private TextView mUploadphoto;
    private EditText mEIdentityNumber;
    private EditText mPhone;
    private CircleImageView mProfileImage;
    private Button mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contionio_signup);
        forceRTLIfSupported();
        mUploadphoto = findViewById(R.id.uploadphoto);
        mEIdentityNumber = findViewById(R.id.mEIdentityNumber);
        mPhone = findViewById(R.id.phone);
        mProfileImage = findViewById(R.id.profile_image);
        mRegister = findViewById(R.id.register);
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEIdentityNumber.getText().toString().equals(null) || mEIdentityNumber.getText().toString().equals("")){
                    Toast.makeText(ContionioSignupActivity.this, ""+getString(R.string.EDiDENTITY), Toast.LENGTH_SHORT).show();
                } else if(mPhone.getText().toString().equals(null) || mPhone.getText().toString().equals("")){
                    Toast.makeText(ContionioSignupActivity.this, ""+getString(R.string.phone), Toast.LENGTH_SHORT).show();
                }
               else{
                    Intent ContionioSignupActivity=new Intent(ContionioSignupActivity.this, SearchMapActivity.class);
                    startActivity(ContionioSignupActivity);
                }
            }
        });
        mUploadphoto.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                PickImageDialog.build(new PickSetup()
                        .setTitle("اختر صورة ")
                        .setProgressText("الرجاء الانتظار يتم تحميل الصورة ")
                        .setCancelText("الغاء ")
                        .setFlip(true)
                        .setMaxSize(500)
                        .setPickTypes(EPickType.GALLERY, EPickType.CAMERA)
                        .setIconGravity(Gravity.RIGHT)
                        .setButtonOrientation(LinearLayoutCompat.VERTICAL)
                        .setSystemDialog(false)

                )                        .setOnPickResult(new IPickResult() {
                            @Override
                            public void onPickResult(PickResult r) {
                                //TODO: do what you have to...
                                  //mProfileImage.setImageBitmap(r.getBitmap());
                                r.getPath();
                                //TODO: do what you have to..
                                mProfileImage.setImageURI(r.getUri());

                                //.


                            }
                        })
                        .setOnPickCancel(new IPickCancel() {
                            @Override
                            public void onCancelClick() {
                                //TODO: do what you have to if user clicked cancel
                            }
                        }).show(getSupportFragmentManager());
            }
        });
    }

    @Override
    public void onPickResult(PickResult r) {
        r.getPath();
        //TODO: do what you have to..
        //.

    }
}
