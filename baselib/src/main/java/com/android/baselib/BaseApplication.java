package com.android.baselib;

import android.app.Application;
import android.graphics.Typeface;

import static com.android.baselib.Constants.FARSI_FONT;

/**
 * Created by Nazila on 2/25/2018.
 */

public class BaseApplication extends Application {
    public static Typeface myTypeface;
    @Override
    public void onCreate() {
        super.onCreate();
        myTypeface=Typeface.createFromAsset(getAssets(),FARSI_FONT);
    }
}
