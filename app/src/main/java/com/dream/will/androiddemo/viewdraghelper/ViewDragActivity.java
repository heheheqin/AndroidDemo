package com.dream.will.androiddemo.viewdraghelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dream.will.androiddemo.R;
import com.dream.will.androiddemo.utile.L;

public class ViewDragActivity extends AppCompatActivity {

    private ViewDragLayout viewDraglayout;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_drag);
        initView();
    }


    private void initView() {
        viewDraglayout = (ViewDragLayout) findViewById(R.id.viewDraglayout);
        viewDraglayout.setOnViewDragListener(new ViewDragLayout.ViewDragListener() {
            @Override
            public void onOpen() {
                title.setText("heheheqin  ---向右滑--->");
                L.d("onOpen");
            }

            @Override
            public void onClose() {
                title.setText("<----- heheheqin");
                L.d("onClose");
            }

            @Override
            public void onDrag(float percent) {
            }
        });
        title = (TextView) findViewById(R.id.title);
    }

    public void clickbutton1(View c) {
        Toast.makeText(this, "打我呀", Toast.LENGTH_SHORT).show();
    }

    public void clickbutton2(View c) {
        Toast.makeText(this, "捉迷藏", Toast.LENGTH_SHORT).show();
    }




}
