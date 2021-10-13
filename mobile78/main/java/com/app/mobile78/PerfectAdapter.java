package com.app.mobile78;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfectAdapter extends BaseAdapter {
    Context c; // GridActivity

    PerfectAdapter(Context context) { // GridActivity
        c = context;
    }

    int[] posterID = {
            R.drawable.hp1,
            R.drawable.hp2,
            R.drawable.hp3,
            R.drawable.hp4,
            R.drawable.hp5,
            R.drawable.hp6,
            R.drawable.hp7,
            R.drawable.hp8
    };

    String[] title = {"그림1", "그림2", "그림3", "그림4", "그림5", "그림6", "그림7", "그림8"};

    @Override
    public int getCount() {
        return posterID.length;
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
        View one = View.inflate(c, R.layout.one, null);
        TextView txt = one.findViewById(R.id.toptext);
        txt.setText(title[i]);
        ImageView img = one.findViewById(R.id.img1);
        img.setImageResource(posterID[i]);
        return one;
    }
}