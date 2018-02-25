package com.android.baselib.views;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import static com.android.baselib.BaseApplication.myTypeface;

/**
 * Created by Nazila on 2/24/2018.
 */

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        if(!isInEditMode())
          this.setTypeface(myTypeface);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(!isInEditMode())
            this.setTypeface(myTypeface);
    }
}
