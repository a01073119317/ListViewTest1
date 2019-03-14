package com.example.listviewtest1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SingerItemView extends LinearLayout {

    TextView textview;
    TextView textview2;

    public SingerItemView(Context context) {
        super(context);
        init(context);
    }

    public SingerItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private  void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true);

        textview = (TextView) findViewById(R.id.textView_name);
        textview2 = (TextView) findViewById(R.id.textView_mobile);
    }

    public void setName(String name) {
        textview.setText(name);
    }

    public void setMobile(String mobile) {
        textview2.setText(mobile);
    }

}
