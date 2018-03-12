package com.app.school.utility;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Avik on 13-03-2018.
 */

public class SharedPref {

    public static boolean getisVerified(Context mContext) {
        SharedPreferences loginPreferences = mContext.getSharedPreferences("schoolapp", 0); // 0 - for private mode
        boolean flag = loginPreferences.getBoolean("is_verified", false);
        return flag;
    }

    public static void setisVerified(Context mContext, boolean isVerified) {
        SharedPreferences preferences = mContext.getSharedPreferences("schoolapp", 0); // 0 - for private mode
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("is_verified", isVerified);
        editor.apply();
    }

}
