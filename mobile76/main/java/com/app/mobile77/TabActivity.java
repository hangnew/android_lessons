package com.app.mobile77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        // 기초적인 tab 초기화
        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        // 각각의 탭 설정
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("song").setIndicator("음악별");
        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("artist").setIndicator("아티스트별");
        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("album").setIndicator("앨범별");

        // 탭에 content 설정
        tabSpecSong.setContent(R.id.tabSong);
        tabSpecArtist.setContent(R.id.tabArtist);
        tabSpecAlbum.setContent(R.id.tabAlbum);

        // 탭호스트에 탭 추가
        tabHost.addTab(tabSpecSong);
        tabHost.addTab(tabSpecArtist);
        tabHost.addTab(tabSpecAlbum);

        // 첫 탭의 내용을 현재 탭으로
        tabHost.setCurrentTabByTag("album");

    }
}