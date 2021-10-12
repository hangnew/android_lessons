package com.app.mobile77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class TabActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        // 존재하는 layout
        LinearLayout layoutSong = findViewById(R.id.tab2Song);
        LinearLayout layoutArtist = findViewById(R.id.tab2Artist);
        LinearLayout layoutAlbum = findViewById(R.id.tab2Album);

        // layout 객체화
        View songView = View.inflate(this, R.layout.song, null);
        View artistView = View.inflate(this, R.layout.artist, null);
        View albumView = View.inflate(this, R.layout.album, null);

        layoutSong.addView(songView);
        layoutArtist.addView(artistView);
        layoutAlbum.addView(albumView);

        TabHost tabHost = findViewById(R.id.tab2host);
        tabHost.setup();

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("song").setIndicator("음악별");
        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("artist").setIndicator("아티스트별");
        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("album").setIndicator("앨범별");

        tabSpecSong.setContent(R.id.tab2Song);
        tabSpecArtist.setContent(R.id.tab2Artist);
        tabSpecAlbum.setContent(R.id.tab2Album);

        tabHost.addTab(tabSpecSong);
        tabHost.addTab(tabSpecArtist);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTabByTag("song");

        Button b1 = songView.findViewById(R.id.tab2Button1);
        ImageView i1 = songView.findViewById(R.id.tab2Image1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setImageResource(R.drawable.song2);
            }
        });

        Button b2 = artistView.findViewById(R.id.tab2Button2);
        ImageView i2 = artistView.findViewById(R.id.tab2Image2);
        TextView t2 = artistView.findViewById(R.id.tab2Text1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2.setImageResource(R.drawable.joy2);
                t2.setText("안녕 (Hello)");
            }
        });

    }
}