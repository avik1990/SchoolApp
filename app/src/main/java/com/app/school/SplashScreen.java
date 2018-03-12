package com.app.school;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.app.school.utility.SharedPref;

public class SplashScreen extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContext = this;

        goToHomeActivity();

       /* if (SharedPref.getisVerified(mContext)) {
            goToHomeActivity();
        } else {
            goToRegistrationActivity();
        }*/

    }

    private void goToRegistrationActivity() {
        Thread background = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3 * 1000);
                    Intent i = new Intent(getBaseContext(), ActivityLogin.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();

                } catch (Exception e) {
                }
            }
        };
        background.start();
    }

    private void goToHomeActivity() {
        Thread background = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3 * 1000);
                    Intent i = new Intent(getBaseContext(), Dashboard.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                } catch (Exception e) {
                }
            }
        };
        background.start();
    }


}
