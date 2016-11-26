package com.dream.will.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dream.will.androiddemo.viewdraghelper.ViewDragActivity;

import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

public class MainActivity extends SwipeBackActivity implements View.OnClickListener {

    SwipeBackLayout swipeBackLayout;
    private Button viewdarghelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //获取  swipeBackLayout
        swipeBackLayout = getSwipeBackLayout();
        //设置 互动的区域
        swipeBackLayout.setEdgeSize(200);
        // 设定滑动关闭的方向  下左右
        swipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);

    }

    private void initView() {
        viewdarghelper = (Button) findViewById(R.id.viewdarghelper);
        viewdarghelper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.viewdarghelper:
                startActivity(new Intent(this, ViewDragActivity.class));
                break;
        }
    }
}
