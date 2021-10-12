package com.app.mobile77;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyGridAdapter extends BaseAdapter {
    Context ctxt;

    public MyGridAdapter(Context context) {
        ctxt = context;
    }

    int[] posterId = {R.drawable.hp1, R.drawable.hp2, R.drawable.hp3, R.drawable.hp4,
            R.drawable.hp5, R.drawable.hp6, R.drawable.hp7, R.drawable.hp8};

    @Override
    public int getCount() {
        return posterId.length;
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
        ImageView imageView = new ImageView(ctxt);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imageView.setPadding(5,5,5,5);
        imageView.setImageResource(posterId[i]);
        return imageView;
    }

}
