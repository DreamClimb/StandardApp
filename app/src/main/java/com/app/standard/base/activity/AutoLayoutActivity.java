package com.app.standard.base.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import com.app.standard.ui.view.auto.widget.AutoFrameLayout;
import com.app.standard.ui.view.auto.widget.AutoLinearLayout;
import com.app.standard.ui.view.auto.widget.AutoRelativeLayout;

//目前支持属性:
//        layout_width
//        layout_height
//        layout_margin(left,top,right,bottom)
//        padding(left,top,right,bottom)
//        textSize
//        maxWidth, minWidth, maxHeight, minHeight

public abstract class  AutoLayoutActivity extends AppCompatActivity {
    private static final String LAYOUT_LINEAR_LAYOUT = "LinearLayout";
    private static final String LAYOUT_FRAME_LAYOUT = "FrameLayout";
    private static final String LAYOUT_RELATIVE_LAYOUT = "RelativeLayout";


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View view = null;
        if (name.equals(LAYOUT_FRAME_LAYOUT)) {
            view = new AutoFrameLayout(context, attrs);
        }

        if (name.equals(LAYOUT_LINEAR_LAYOUT)) {
            view = new AutoLinearLayout(context, attrs);
        }

        if (name.equals(LAYOUT_RELATIVE_LAYOUT)) {
            view = new AutoRelativeLayout(context, attrs);
        }

        if (view != null) return view;

        return super.onCreateView(name, context, attrs);
    }
}
