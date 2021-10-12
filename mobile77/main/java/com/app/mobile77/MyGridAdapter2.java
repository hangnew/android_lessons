package com.app.mobile77;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyGridAdapter2 extends BaseAdapter {

    Context thisContext;

    public MyGridAdapter2(Context context) {
        thisContext = context;
    }

    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(thisContext);
        textView.setLayoutParams(new ViewGroup.LayoutParams(200, 100));
        textView.setText("TextView" + i);
        return textView;
    }
}
