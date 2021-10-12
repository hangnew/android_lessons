package com.app.mobile77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class GiftTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_tab);

        TabHost tabHost = findViewById(R.id.giftTabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecHome = tabHost.newTabSpec("home").setIndicator("홈");
        TabHost.TabSpec tabSpecCategory = tabHost.newTabSpec("category").setIndicator("카테고리");
        TabHost.TabSpec tabSpecGift = tabHost.newTabSpec("gift").setIndicator("선물함");

        tabSpecHome.setContent(R.id.giftTab1);
        tabSpecCategory.setContent(R.id.giftTab2);
        tabSpecGift.setContent(R.id.giftTab3);

        tabHost.addTab(tabSpecHome);
        tabHost.addTab(tabSpecCategory);
        tabHost.addTab(tabSpecGift);

        tabHost.setCurrentTabByTag("home");

    }
}