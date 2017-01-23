package com.dream.will.water_ripple;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView iv_title_menu;
    private FrameLayout ll_title_menu;
    private ImageView iv_title_gank;
    private ImageView iv_title_one;
    private ImageView iv_title_dou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);
        initView();
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //去除默认Title显示
            actionBar.setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search: {
                Toast.makeText(this, "手势", Toast.LENGTH_SHORT).show();
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        iv_title_menu = (ImageView) findViewById(R.id.iv_title_menu);
        ll_title_menu = (FrameLayout) findViewById(R.id.ll_title_menu);
        ll_title_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "iv_title_menu", Toast.LENGTH_SHORT).show();
            }
        });
        iv_title_gank = (ImageView) findViewById(R.id.iv_title_gank);
        iv_title_gank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "gank", Toast.LENGTH_SHORT).show();
                iv_title_gank.setSelected(true);
            }
        });
        iv_title_one = (ImageView) findViewById(R.id.iv_title_one);
        iv_title_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "iv_title_one", Toast.LENGTH_SHORT).show();
            }
        });
        iv_title_dou = (ImageView) findViewById(R.id.iv_title_dou);
        iv_title_dou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "iv_title_dou", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
