package com.example.klayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        initViews();
    }


    void initViews(){
        text=findViewById(R.id.t_user);
        String userID=getIntent().getStringExtra("userid");
        String UserPw=getIntent().getStringExtra("userpw");
        text.setText("UserID "+userID+ "\nUserPW "+UserPw);
    }
}
