package com.app.school;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class ActivityLogin extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext = this;

    }
}
