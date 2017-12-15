package com.com.trin.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2017/12/6.
 */

public class ActionBar extends LinearLayout{
    private Context context;
    public ActionBar(Context context) {
        super(context);
        this.context=context;
    }

    public ActionBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        Toast.makeText(context,"zidingyi",Toast.LENGTH_SHORT).show();
        into();
    }

    public ActionBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        into();
    }



    private void into(){
        View v=inflate(context, R.layout.layout_view_actionbar,ActionBar.this);

    }
}
