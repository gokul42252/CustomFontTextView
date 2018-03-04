package com.cretlabs.customfonttextview.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;

import com.cretlabs.customfonttextview.R;


/**
 * Created by Gokul on 1/13/2018.
 */

public class CustomFontTextView extends AppCompatTextView {
    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }


    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.CustomFontTextView, 0, 0);
        String fontName = a.getString(R.styleable.CustomFontTextView_fontName);
        Typeface face = null;
        if (fontName != null && !TextUtils.isEmpty(fontName)) {
            face = Typeface.createFromAsset(context.getAssets(), fontName);
        } else {
            face = Typeface.createFromAsset(context.getAssets(), "Steelworks Vintage Demo.ttf");
        }
        this.setTypeface(face);
        a.recycle();
    }
}
