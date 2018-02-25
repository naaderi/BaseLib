package com.android.baselib.views;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import static com.android.baselib.BaseApplication.myTypeface;

/**
 * Created by Nazila on 2/25/2018.
 */

public class MyEditText extends AppCompatEditText{
    public MyEditText(Context context) {
        super(context);
        if(!isInEditMode())
            this.setTypeface(myTypeface);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(!isInEditMode())
            this.setTypeface(myTypeface);
    }
}
